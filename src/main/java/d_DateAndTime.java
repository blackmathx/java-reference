
import java.time.*;

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

    // also takes Month reference
//    LocalDateTime.of(int year, Month month, int dayOfMonth, int hour, int minute) <, int second, int nanos>);
    LocalDateTime dateTimeA = LocalDateTime.of(2023, Month.APRIL, 1, 8, 58, 0);
    System.out.println("date time a: " + dateTimeA);
    // also takes LocalDate and LocalTime
    LocalDate date1 = LocalDate.now();
    LocalTime time1 = LocalTime.now();
    LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
    System.out.println("Date and Time: " + dateTime1);



    // Month has ENUMs. https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/Month.html
    Month m = Month.of(2);
    System.out.println(m); // FEBRUARY
    System.out.println(m.length(false));

    var zone1 = ZonedDateTime.of(2022, 1, 20, 6, 15, 30, 200, ZoneId.of("US/Eastern"));
    System.out.println(zone1);

    // creating ZoneDateTime three ways
//    ZoneDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos, ZoneId zone);
//    ZoneDateTime.of(LocalDate date, LocalTime time, ZoneId zone);
//    ZoneDateTime.of(LocalDateTime dateTime, ZoneId zone);


    // Adding to a date
    // date and time classes are immutable so assign the results so they are not lost
    var date = LocalDate.of(2022, 3, 23);
    System.out.println(date);
    date = date.plusDays(1);
    date = date.plusWeeks(2);
    date = date.plusMonths(1);
    date = date.plusYears(1);
    date = date.minusYears(2);
    date = date.minusWeeks(2);
    date = date.minusWeeks(2).minusDays(2);


    var date99 = LocalDate.of(2022, 8, 23);
    var time99 = LocalTime.of(20, 33);
    var dateTime99 = LocalDateTime.of(date99, time99);
    dateTime99 = dateTime99.minusWeeks(4);

    var dateTime = LocalDateTime.now();
    dateTime = dateTime.minusDays(2).minusMinutes(1).minusSeconds(23);



    // TODO, Period

    // TODO, Duration

    // TODO, Instant



  }

}