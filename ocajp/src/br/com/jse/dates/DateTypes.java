package br.com.jse.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/* public class */ public class /*Data types is the name of class*/ DateTypes {
    public static void main(String[] args) {

        System.out.println("-- Date and Time types --");
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println();

        System.out.println("-- Local Time with Zone ID --");

        LocalTime lisbon = LocalTime.now(ZoneId.of("Europe/Lisbon"));
        LocalTime brazil = LocalTime.now(ZoneId.of("America/Sao_Paulo"));

        System.out.println(lisbon);
        System.out.println(brazil);
        System.out.println();

        System.out.println("-- Custom time and dare --");
        LocalTime middleDay = LocalTime.of(12,0);
        LocalDate christmas = LocalDate.of(2014,12,25);
        LocalDateTime fullChristmas = LocalDateTime.of(christmas, middleDay);
        LocalDate newYear = LocalDate.of(2014, Month.DECEMBER,31);

        System.out.println(middleDay);
        System.out.println(christmas);
        System.out.println(fullChristmas);
        System.out.println(newYear);
        System.out.println();

        System.out.println("-- Extract pieces of date --");
        System.out.println(christmas.getYear());
        System.out.println(christmas.getMonth());
        System.out.println(christmas.getDayOfMonth());
        System.out.println(fullChristmas.get(ChronoField.DAY_OF_YEAR));
        System.out.println(fullChristmas.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(fullChristmas.get(ChronoField.YEAR_OF_ERA));
        System.out.println(fullChristmas.get(ChronoField.HOUR_OF_DAY));
        System.out.println(fullChristmas.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println();

        System.out.println("-- Comparing Dates --");

        MonthDay d1 = MonthDay.of(1,1);
        MonthDay d2 = MonthDay.of(1,2);

        System.out.println(d1.isBefore(d2));
        System.out.println(d2.isBefore(d1));
        System.out.println(d2.isAfter(d1));
        System.out.println(d1.isAfter(d2));
        System.out.println(d1.equals(d2));
        System.out.println();

        System.out.println("-- Assigning --");
        LocalDate oldDate = LocalDate.of(2016,4,4);
        LocalDate neoDate = oldDate.withDayOfMonth(3);

        System.out.println(oldDate);
        System.out.println(neoDate);
        System.out.println(oldDate.plusDays(27));
        System.out.println(oldDate.plusYears(5));
        System.out.println(oldDate.minus(5, ChronoUnit.YEARS));
        System.out.println("");

        System.out.println("-- Conversion of Dates --");
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate date = dateTime.toLocalDate();
        System.out.println(dateTime);
        System.out.println(date);
        System.out.println(dateTime.toLocalTime());

        LocalDateTime recoverDateTimeByDate = date.atTime(dateTime.toLocalTime());
        LocalDateTime recoverDateTimeByTime = dateTime.toLocalTime().atDate(date);
        System.out.println(recoverDateTimeByDate);
        System.out.println(recoverDateTimeByTime);
        System.out.println();

        System.out.println("-- Parsing Old Java Date API to a new API Java Time");
        Date d = new Date();
        Instant i = d.toInstant(); //milliseconds since 01/01/1970
        LocalDateTime dateByOldJavaDateAPI = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
        System.out.println(dateByOldJavaDateAPI);

        Calendar calendar = Calendar.getInstance();
        Instant instant = calendar.toInstant();
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(ldt);

        Instant utc = localDateTime.toInstant(ZoneOffset.UTC);
        System.out.println(String.format("ZoneOffset.UTC %S", utc));
        System.out.println("");

        System.out.println("-- Operations with Dates --");
        Instant i1 = Instant.now();
        Instant i2 = i1.plus(Duration.ofSeconds(10));
        System.out.println(i1);
        System.out.println(i2);

        Instant epoch1970 = Instant.EPOCH;
        Instant now = Instant.now();

        Long secondsBetween1970andNow = Duration.between(epoch1970, now).getSeconds();
        System.out.println(secondsBetween1970andNow);

        LocalDateTime birthDay = LocalDateTime.of(1990,12,26,12,0);
        LocalDateTime today = LocalDateTime.now();
        System.out.println(ChronoUnit.YEARS.between(birthDay, today));
        System.out.println(ChronoUnit.MONTHS.between(birthDay, today));
        System.out.println(ChronoUnit.DAYS.between(birthDay, today));
        System.out.println(ChronoUnit.HOURS.between(birthDay, today));
        System.out.println(ChronoUnit.MINUTES.between(birthDay, today));
        System.out.println(ChronoUnit.SECONDS.between(birthDay, today));

        Period lifeTime = Period.between(birthDay.toLocalDate(), today.toLocalDate());
        System.out.println(lifeTime.getYears());
        System.out.println(lifeTime.getMonths());
        System.out.println(lifeTime.getDays());
        System.out.println();

        System.out.println("-- Format Dates --");

        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterFullTime = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss:mm");
        System.out.println(formatter.format(currentDate));
        System.out.println(formatterFullTime.format(currentDate));
        System.out.println(LocalDate.parse("28/12/2021", formatter));
    }
    //Date without hour
    LocalDate localDate;

    //Time without date
    LocalTime localTime;

    //Date and Time
    LocalDateTime localDateTime;

    //day of current Month
    MonthDay monthDay;

    //Month of current year
    YearMonth yearMonth;
}
