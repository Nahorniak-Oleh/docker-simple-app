package org.epam.nahorniak.simpleapp.configuration.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateTimeUtils {

    public static String getCurrentDateTime(){

        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return localDateTime.format(formatter);
    }
}
