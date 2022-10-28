package com.soojong.basic.optional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {

        int i = case3(2);
        System.out.println(i);


    }

    public static int case3(int num) {

        List<Integer> list = List.of(1, 2, 3, 4);

        return list.stream()
            .filter( a -> a == num)
            .findFirst()
            .orElse(0);



    }

    public static void case2(double num, double sum) {

        double sizeItemRate = Optional.of(sum)
            .filter(s -> s > 0)
            .map(s -> num/s * 100 )
            .orElse(0.0);

        System.out.println(sizeItemRate);


    }
    public static void case1() {

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
