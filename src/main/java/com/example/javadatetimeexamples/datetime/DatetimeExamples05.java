package com.example.javadatetimeexamples.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DatetimeExamples05 {

    public static void getFullYearMonth(String dateString) {
        // 대상 날짜로 LocalDateTime 만들기
        LocalDateTime parsedLocalDateTime = LocalDateTime.parse(dateString);

        // LocalDateTime에서 필요한 내용 필요한 형식으로 뽑기
        String yyyyMMdd = parsedLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String yyyy = parsedLocalDateTime.format(DateTimeFormatter.ofPattern("yyyy"));
        String MM = parsedLocalDateTime.format(DateTimeFormatter.ofPattern("MM"));

        System.out.println(yyyyMMdd);
        System.out.println(yyyy);
        System.out.println(MM);

        System.out.println("---------------");

        String yyMd = parsedLocalDateTime.format(DateTimeFormatter.ofPattern("yy-M-d"));
        String yy = parsedLocalDateTime.format(DateTimeFormatter.ofPattern("yy"));
        String M = parsedLocalDateTime.format(DateTimeFormatter.ofPattern("M"));

        System.out.println(yyMd);
        System.out.println(yy);
        System.out.println(M);
    }

    public static void main(String[] args) {
        getFullYearMonth("2018-08-04T10:11:30");
    }
}
