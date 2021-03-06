package com.common.utils;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author Jerax
 * @date 2019/10/27 11:49 AM
 **/
public class DateUtils {

    public static final LocalDateTime date2LocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.of("Z")).toLocalDateTime();
    }

    public static final Date localDateTime2Date(LocalDateTime localDateTime) {
        return Timestamp.valueOf(localDateTime);
    }

    public static final OffsetDateTime date2OffsetDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.of("Z")).toOffsetDateTime();
    }

    public static final Date offsetDateTime2Date(OffsetDateTime offsetDateTime) {
        return Timestamp.from(offsetDateTime.toInstant());
    }

    public static final LocalDate date2LocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.of("Asia/Shanghai")).toLocalDate();
    }

    public static final LocalTime date2LocalTime(Date date) {
        return date.toInstant().atZone(ZoneId.of("Asia/Shanghai")).toLocalTime();
    }
}
