package com.common.utils;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.*;
import java.util.Date;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date:" + date);

        final LocalDateTime localDateTime = dateToLocalDateTime(date);
        System.out.println("localDateTime:" + localDateTime);
        System.out.println("localDateTime2Date:" + localDateTime2Date(localDateTime));

        final OffsetDateTime offsetDateTime = date2OffsetDateTime(date);
        System.out.println("offsetDateTime:" + offsetDateTime);
        System.out.println("offsetDateTime2Date:" + offsetDateTime2Date(offsetDateTime));

        final LocalDate localDate = date2LocalDate(date);
        System.out.println("localDate:" + localDate);

        final LocalTime localTime = date2LocalTime(date);
        System.out.println("date2LocalTime:" + localTime);
    }

    private static LocalDateTime dateToLocalDateTime(Date date) {
        return DateUtils.date2LocalDateTime(date);
    }

    private static Date localDateTime2Date(LocalDateTime localDateTime) {
        return DateUtils.localDateTime2Date(localDateTime);
    }

    private static OffsetDateTime date2OffsetDateTime(Date date) {
        return DateUtils.date2OffsetDateTime(date);
    }

    private static Date offsetDateTime2Date(OffsetDateTime offsetDateTime) {
        return DateUtils.offsetDateTime2Date(offsetDateTime);
    }

    private static LocalDate date2LocalDate(Date date) {
        return DateUtils.date2LocalDate(date);
    }

    private static LocalTime date2LocalTime(Date date) {
        return DateUtils.date2LocalTime(date);
    }
}
