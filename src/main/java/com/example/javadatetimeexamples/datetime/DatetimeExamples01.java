package com.example.javadatetimeexamples.datetime;

import java.time.LocalDateTime;

public class DatetimeExamples01 {
    public static void main(String[] args) {
        //년월일 시분초 지정해서 LocalDateTime생성하기
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ldt = LocalDateTime.of(now.getYear(),
                now.getMonth(), now.getDayOfMonth(), now.getHour(), 0, 0);

        System.out.println(ldt);
    }
}
