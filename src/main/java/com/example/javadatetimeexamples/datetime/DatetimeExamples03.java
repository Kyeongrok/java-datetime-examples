package com.example.javadatetimeexamples.datetime;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DatetimeExamples03 {

    private static boolean checkDateTime(Date date, LocalTime lt){
        LocalDateTime localDateTimeGameUntil = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).with(lt);

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        return localDateTimeNow.isBefore(localDateTimeGameUntil);
    }

    public static void main(String[] args) {
        //3.Java Date + LocalTime으로 LocalDateTime 만들고 비교하기
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        System.out.println(checkDateTime(date, LocalTime.now()));
    }
}
