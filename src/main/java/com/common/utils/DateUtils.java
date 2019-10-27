/*
 * Copyright (C) GSX Techedu Inc. All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

package com.common.utils;

import java.sql.Timestamp;
import java.time.*;
import java.util.Date;

/**
 * @author Jerax
 * @date 2019/10/27 11:49 AM
 **/
public class DateUtils {

    public static LocalDateTime date2LocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.of("Z")).toLocalDateTime();
    }

    public static Date localDateTime2Date(LocalDateTime localDateTime) {
        return Timestamp.valueOf(localDateTime);
    }

    public static OffsetDateTime date2OffsetDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.of("Z")).toOffsetDateTime();
    }

    public static Date offsetDateTime2Date(OffsetDateTime offsetDateTime) {
        return Timestamp.from(offsetDateTime.toInstant());
    }

    public static LocalDate date2LocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.of("Asia/Shanghai")).toLocalDate();
    }

    public static LocalTime date2LocalTime(Date date) {
        return date.toInstant().atZone(ZoneId.of("Asia/Shanghai")).toLocalTime();
    }
}
