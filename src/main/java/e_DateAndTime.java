
import java.time.*;
import java.util.Set;
import java.time.temporal.ChronoUnit;


public class e_DateAndTime {

  public static void run(){
    System.out.println("\n======= DateAndTime =====================================================================\n");
    // The date and time methods are in package java.time.*;


    // All have a .now() method
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());
    System.out.println(ZonedDateTime.now());


    // All have a overloaded .of() method
    LocalDate ld_1 = LocalDate.of(2025, 1, 2);
    LocalDate ld_2 = LocalDate.of(2020, Month.MARCH, 23);
    LocalDate ld_3 = LocalDate.of(2025, Month.of(10), 31);
    int year = ld_1.getYear();
    // getMonth(), getDayOfYear(), getDayOfYear(), ..


    LocalTime lt_1 = LocalTime.of(12, 58); // hour, minute
    LocalTime lt_2 = LocalTime.of(12, 58, 30); // hour, minute, second
    LocalTime lt_3 = LocalTime.of(12, 58, 30, 100); // hour, minute, second, nanosecond
    int hour = lt_1.getHour();
    int minute = lt_1.getMinute();


    LocalDateTime ldt_1 = LocalDateTime.of(2025, 1, 30, 13, 58, 30);
    LocalDateTime ldt_2 = LocalDateTime.of(ld_1, lt_1);
    LocalDateTime ldt_3 = LocalDateTime.of(2025, Month.SEPTEMBER, 21, 18, 10, 30);
    Month mo = ldt_1.getMonth();
    int hour2 = ldt_1.getHour();
    // getYear(), getDayOfWeek(), getDayOfMonth(), getSecond(), ..


    // Zones
    Set<String> zoneIds = ZoneId.getAvailableZoneIds();
    System.out.println(zoneIds.size());
    for(String z : zoneIds) if(z.contains("East")) System.out.println(z);


    ZonedDateTime zdt_0 = ZonedDateTime.now();
    ZonedDateTime zdt_1 = ZonedDateTime.of(2025, 3, 15, 10, 56, 30, 100, ZoneId.of("America/New_York")); // needs nanos
    ZonedDateTime zdt_2 = ZonedDateTime.of(ld_1, lt_1, ZoneOffset.of("+05:00")); // (LocalDate, LocalTime, ZoneId)
    ZonedDateTime zdt_3 = ZonedDateTime.now(ZoneId.of("America/New_York"));
    ZonedDateTime zdt_4 = ldt_2.atZone(ZoneOffset.of("+05:00"));
    ZonedDateTime zdt_5 = ldt_2.atZone(ZoneId.of("US/Eastern"));

    ZoneId zid_1 = zdt_1.getZone();


    boolean b_1 = lt_1.isAfter(lt_2);
    boolean b_2 = ld_1.isBefore(ld_2);
    boolean b_3 = ldt_2.isAfter(ldt_3);

    int i_1 = ld_1.getDayOfMonth();
    Month m_1 = ld_1.getMonth();
    int m_2 = ld_1.getMonthValue();
    int y_1 = ld_1.getYear();





    //==================================================================================================================
    System.out.println("\n======= Manipulating Dates and Times ====================================================\n");
    // Manipulating Dates and Times


    LocalDate ld_100 = ld_1.plusDays(1);
    LocalDate ld_101 = ld_1.plusMonths(1);
    // plusYears(), plusWeeks(), minusDays(), minusWeeks(), minusMonths(), minusYears()

    LocalTime lt_100 = lt_1.plusHours(1);
    LocalTime lt_101 = lt_1.plusMinutes(1);
    lt_100 = lt_100.plusSeconds(10).plusNanos(10);
    // minusHours(), minusMinutes(), minusSeconds(), minusNanos()

    LocalDateTime ldt_100 = ldt_1.plusDays(1);
    LocalDateTime val = ldt_100.plusMinutes(1).minusMonths(1);
    // All the rest of the plus and minus methods


    // With Duration and Period you can use certain methods
    // With Dates you can use ldt.plus(<Period>)
    // With Times/DateTimes you can use ldt.plus(<Duraction>) or




    //==================================================================================================================
    System.out.println("\n======= Period ==========================================================================\n");
    // Period is a day or more of time. Used to add to dates: LocalDate, LocalDateTime, ZonedDateTime

    var per_1 = Period.ofDays(1);
    var per_2 = Period.ofYears(25);
    var per_3 = Period.ofWeeks(2);
    var per_4 = Period.of(1, 3, 20); // Years, Months, Days





    //==================================================================================================================
    System.out.println("\n======= Duration ========================================================================\n");
    // Duration for smaller units of time.
    // Used with objects that have a time and stored as hours, minutes, seconds (with fractional seconds)

    Duration dur_1 = Duration.ofDays(1);
    var dur_2 = Duration.ofHours(4);
    var dur_3 = Duration.ofMinutes(20);
    var dur_4 = Duration.ofSeconds(30);
    var dur_5 = Duration.ofMillis(200);

    var dur_6 = Duration.of(1, ChronoUnit.MINUTES);
    var dur_7 = Duration.of(20, ChronoUnit.MONTHS);
    // ChronoUnit.CENTURIES, WEEKS, YEARS, ERAS, DECADES, FOREVER, ...

    // ChronoUnit can determine how far apart two Temporal values are. Temporal includes LocalDate, LocalTime
    var lt_200 = LocalTime.of(3, 45);
    var lt_201 = LocalTime.of(18, 32);
    long diffInMinutes = ChronoUnit.MINUTES.between(lt_200, lt_201);
    long diffInHours = ChronoUnit.HOURS.between(lt_200, lt_201); // between() truncates instead of rounds (14h 47m == 14)





    //==================================================================================================================
    System.out.println("\n======= Instant =========================================================================\n");
    // Instant represents a specific moment in time in GMT time zone

    var inst_1 = Instant.now();
    inst_1 = inst_1.plus(Duration.ofDays(1));
    var inst_2 = zdt_1.toInstant(); // removes the zone and turns it into an Instant of GMT time

    var zdt_200 = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(12, 15), ZoneId.of("US/Eastern"));
    Instant inst_100 = zdt_200.toInstant(); // toInstant removes the zone and turns it into an Instant of GMT time




    //==================================================================================================================
    System.out.println("\n======= Daylight Savings Time============================================================\n");
    // TODO daylight savings time



  }

}