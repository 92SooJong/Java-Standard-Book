package com.soojong.basic.optional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {
        List<String> aList = List.of("4", "6");
        List<String> bList = List.of("11","12","13","11");

        Map<String,String> subjectMap = new HashMap<>();
        subjectMap.put("4", "four");
        subjectMap.put("6", "six");

        Map<String,String> itemMap = new HashMap<>();
        itemMap.put("four.11","one-one-1");
        itemMap.put("four.12","one-two");
        itemMap.put("six.13","one-three");
        itemMap.put("six.11","one-one-2");

        String inputA = "4";
        String inputB = "11";
        String result = Optional.ofNullable(List.of(inputA,inputB))
            .filter( m -> m.get(0).equals("4") || m.get(0).equals("6"))
            .map( m -> subjectMap.get(m.get(0))+"."+ m.get(1))
            .map(itemMap::get)
            .map( m -> "출력 :: " + m)
            .orElse("데이터없음");

        System.out.println(result);
    }
}
