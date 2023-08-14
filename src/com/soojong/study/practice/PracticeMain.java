package com.soojong.study.practice;

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



        Map<String, A> map = new HashMap<>();
        map.put("aaa", A.of(1L));
        map.put("bbb", A.of(null));

        if (map.containsKey(null)) {
            System.out.println("NULL");
        }



    }

}


