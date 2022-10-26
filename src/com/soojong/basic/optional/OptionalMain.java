package com.soojong.basic.optional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {


        Map<String,String> subjectMap = new HashMap<>();
        subjectMap.put("4", "four");
        subjectMap.put("6", "six");

        Map<String,String> itemMap = new HashMap<>();
        itemMap.put("4.11","one-one-1");
        itemMap.put("4.12","one-two");
        itemMap.put("6.13","one-three");
        itemMap.put("6.11","one-one-2");

        Map<String, String> input = Map.of("input1", "4", "input2", "11");

        String result = Optional.ofNullable(input)
            .filter(m -> m.containsKey("input122"))
            .map( m -> m.get("input1") + "." + m.get("input2"))
            .map(itemMap::get)
            .map( m -> "출력 :: " + m)
            .orElse("데이터없음");

        System.out.println(result);
    }
}
