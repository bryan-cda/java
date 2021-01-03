package br.com.jse.colletions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Java8Dates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(ZoneId.systemDefault());

        LocalDate birthDay = LocalDate.of(2021, 12, 26);

        Period period = Period.between(today, birthDay);

        System.out.println(String.format("Time remaining to my birthday " +
                "= %s years, %s months and %s days",
                period.getYears(),
                period.getMonths(),
                period.getDays()));

        System.out.println(today);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dateFormatted = birthDay.format(dateTimeFormatter);

        System.out.println(dateFormatted);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(formatter));


    }
}
