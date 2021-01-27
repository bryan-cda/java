package br.com.jse.dates;

import java.time.*;
import java.time.temporal.ChronoField;

public class DateTypes {
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
