package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2001, 1, 15, 23, 56);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm yyyy/dd/MM");
        String dateStr = dateTimeFormatter.format(localDateTime);

        System.out.println(dateStr);
    }
}
