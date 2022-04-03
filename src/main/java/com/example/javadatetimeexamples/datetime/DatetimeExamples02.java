package com.example.javadatetimeexamples.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatetimeExamples02 {
    public static void main(String[] args) {
        // yyyy-mm-dd hh:mm:ss형식의 String을 LocalDateTime으로 바꾸기
        LocalDateTime d = LocalDateTime.parse("2016-10-31 23:59:59",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(d);
    }

}
