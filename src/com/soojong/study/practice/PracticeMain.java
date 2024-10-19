package com.soojong.study.practice;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class PracticeMain {

    public static class A {
        private Long num;

        public static A of(Long a) {
            A a1 = new A();
            a1.num = a;
            return a1;
        }

    }

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.of(2023, 8, 21, 23,59, 59, 100);
        Duration between = Duration.between(now, now.toLocalDate().atTime(23,59,59));
        System.out.println(between.getSeconds());

        LocalDateTime now1 = LocalDateTime.of(2023, 8, 21, 23,59, 59);
        Duration between1 = Duration.between(now1, now1.toLocalDate().atTime(23,59,59));
        System.out.println(between1.getSeconds());

        LocalDateTime now2 = LocalDateTime.now();
        Duration between2 = Duration.between(now2, now2.toLocalDate().atTime(now2.getHour(), now2.getMinute(), now2.getSecond()));
        System.out.println(between2.getSeconds());


    }

}


