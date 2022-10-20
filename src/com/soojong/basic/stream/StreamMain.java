package com.soojong.basic.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMain {

    public static void main(String[] args) {

        practiceIntStream();

//        Map<String,String> map = Map.ofEntries(
//            Map.entry("k1", "v1"),
//            Map.entry("k2","v2")
//        );
//
//        List<String> list = List.of("e1","e2","e3");
//        System.out.println(list.stream().getClass());

    }

    private static void practiceIntStream() {

        int[] results = IntStream.iterate(0, step -> step + 1)
            .limit(10)
            .map(
                operand -> operand * 2
            ).toArray();

        // print results
        for (int result : results) {
            System.out.println(result);
        }


    }

}
