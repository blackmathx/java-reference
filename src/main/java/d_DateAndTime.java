
import java.time.*;
import java.time.temporal.ChronoUnit;

@SuppressWarnings("all")
public class d_DateAndTime{

  
  public static void runner(){
    System.out.println("\n=== DateAndTime ================\n");

    // old java.util.Date class replaced with java.time.* classes in Java 8

    // LocalDate contains just a date and no time or time zone
    // LocalTime contains just the time and no date and no time zone
    // LocalDateTime contains a date and time but no time zone
    // ZonedDateTime contains a date, time, and time zone

    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());
    System.out.println(ZonedDateTime.now());

//    LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minute);
//    LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second);
//    LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos);
//    LocalDateTime.of(int year, Month month, int dayOfMonth, int hour, int minute) <, int second, int nanos>);     // also takes Month reference
    LocalDateTime dateTimeA = LocalDateTime.of(2023, Month.APRIL, 1, 8, 58, 0);
    System.out.println("date time a: " + dateTimeA);

    LocalDate date1 = LocalDate.now();
    LocalTime time1 = LocalTime.now();
    LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);     // also takes LocalDate and LocalTime
    System.out.println("Date and Time: " + dateTime1);

    System.out.println(date1.getMonth());
    System.out.println(date1.getYear());
    System.out.println(date1.getDayOfYear());
    //...



    // Month has ENUMs. https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/Month.html
    Month m = Month.of(2);
    System.out.println(m); // FEBRUARY
    System.out.println(m.length(false));

    var zoned1 = ZonedDateTime.of(2022, 1, 20, 6, 15, 30, 200, ZoneId.of("US/Eastern"));
    System.out.println(zoned1);

    // creating ZoneDateTime three ways
//    ZoneDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos, ZoneId zone);
//    ZoneDateTime.of(LocalDate date, LocalTime time, ZoneId zone);
//    ZoneDateTime.of(LocalDateTime dateTime, ZoneId zone);


    // Adding to a date
    // date and time classes are immutable so assign the results so they are not lost
    var date = LocalDate.of(2022, 3, 23);
    date = date.plusDays(1);
    date = date.plusWeeks(2);
    date = date.plusMonths(1).plusYears(1);
    date = date.minusYears(2);
    date = date.minusDays(3);
    date = date.minusWeeks(2);
    date = date.minusWeeks(2).minusDays(2);

    var dateTime10 = LocalDateTime.of(2024, 1, 1, 4, 34, 9);
    dateTime10 = dateTime10.plusDays(1).plusHours(2);
    dateTime10 = dateTime10.plusSeconds(23);
    dateTime10 = dateTime10.plusMinutes(2);
    dateTime10 = dateTime10.minusYears(8);

    System.out.println(dateTime10.getHour());
    System.out.println(dateTime10.getSecond());
    // ...


    var date99 = LocalDate.of(2022, 8, 23);
    var time99 = LocalTime.of(20, 33);
    var dateTime99 = LocalDateTime.of(date99, time99);
    dateTime99 = dateTime99.minusWeeks(4).plusMinutes(20);

    var dateTime = LocalDateTime.now();
    dateTime = dateTime.minusDays(2).minusMinutes(1).minusSeconds(23);



    //==== PERIOD ======================
    // Period is used to add to dates: LocalDate, LocalDateTime, ZonedDateTime
    var date20 = LocalDate.of(2023, 12, 30);
    Period p1 = Period.ofMonths(2);
    p1 = Period.ofDays(2);
    p1 = Period.ofWeeks(1);
    p1 = Period.ofYears(1);
    date20 = date20.plus(p1);

    Period p2 = Period.of(1, 0, 3); // Period of 1year, 3 days. Printing it yeilds "P1Y3D"
    Period p3 = Period.of(0,0,1); // Period of 1 day, Printing it yields "P1D"

    date20 = date20.minus(p3);



    //==== DURATION =====================
    // Duration is the same as Period but used for time: LocalDateTime, LocalTime, ZonedDateTime
    var daily = Duration.ofDays(32); // PT24H
    var hourly = Duration.ofHours(1); // PT1H
    var minutes =  Duration.ofMinutes(5); // PT5M
    // Duration.ofSeconds(30); // PT30S
    // Duration.ofMillis(20); // PT0.02S
    // Duration.ofNanos(1); // PT0.000000001S

    var date30 = LocalDateTime.of(2024, 1, 9, 16, 30, 0);
    date30 = date30.plus(hourly);
    date30 = date30.plus(minutes);

    // ChronoUnit Enums allow rewriting above Duration as
    var daily2 = Duration.of(1, ChronoUnit.DAYS);
    var hourly3 = Duration.of(20, ChronoUnit.HOURS);
    var second4 = Duration.of(20, ChronoUnit.SECONDS);
    //var yearly = Period.of(20, ChronoUnit.YEARS); // PERIOD DOES NOT HAVE A METHOD 'of(int unit, Temporal time)'

    // ChronoUnit.MINUTES
    // ChronoUnit.NANOS
    // ChronoUnit.MILLIS
    // ChronoUnit.CENTURIES, WEEKS, YEARS, ERAS, DECADES, FOREVER, ...

    // ChronoUnit can determine how far apart two Temporal values are. Temporal includes LocalDate, LocalTime, so on in java.time.temporal
    var time10 = LocalTime.of(3, 45);
    var time11 = LocalTime.of(18, 32);
    long diffInMinutes = ChronoUnit.MINUTES.between(time10, time11);
    long diffInHours = ChronoUnit.HOURS.between(time10, time11); // 14 shows that between truncates instead of rounds (14h 47m == 14)
    System.out.println(diffInHours);

    // ChronoUnit used to truncate
    LocalTime time20 = LocalTime.of(21, 23, 59, 23); // 21:23:59.23
    time20 = time20.truncatedTo(ChronoUnit.MINUTES); // zeros out anything smaller than minuts yielding 21:23



    //== INSTANT
    // Instant represents a specific moment in time in the GMT time zone
    var instantNow = Instant.now();
    // do something
    var duration = Duration.between(instantNow, Instant.now());
    System.out.println(duration.toMillis());

    var zonedDateTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(12, 15), ZoneId.of("US/Eastern")); // includes zone
    Instant instant99 = zonedDateTime.toInstant(); // toInstant removes the zone and turns it into an Instant of GMT time






  }

}