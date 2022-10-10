package com.soojong.basic.stream;

import java.util.List;
import java.util.Map;

public class StreamMain {

    public static void main(String[] args) {

        Map<String,String> map = Map.ofEntries(
            Map.entry("k1", "v1"),
            Map.entry("k2","v2")
        );

        List<String> list = List.of("e1","e2","e3");
        System.out.println(list.stream().getClass());

    }
}
