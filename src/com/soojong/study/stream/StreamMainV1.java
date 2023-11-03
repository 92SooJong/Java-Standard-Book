package com.soojong.study.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamMainV1 {

    public static void main(String[] args) {
        // 각 상품 변호별 브랜드ID를 가져온다
        Map<Long, String> brandByGoods = new HashMap<>();

        brandByGoods.put(1L, "A");
        brandByGoods.put(2L, "A");
        brandByGoods.put(3L, "B");
        brandByGoods.put(4L, "B");
        brandByGoods.put(5L, "B");
        brandByGoods.put(6L, "B");
        brandByGoods.put(7L, "C");



        // 가장 숫자가 많은 브랜드는?
        List<String> brandIdList = brandByGoods
            .entrySet()
            .stream()
            .collect(Collectors.groupingBy(Entry::getValue, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(stringLongEntry -> stringLongEntry.getValue() > 1) // 2번 이상 등장한 상품만 정렬 대상이다
            .sorted(Entry.<String, Long>comparingByValue().reversed())
            .map(Entry::getKey)
            .toList()
            .stream()
            .limit(5)
            .collect(Collectors.toList());

        System.out.println(brandIdList);

        System.out.println(getKey("A","B",true));

        List<Object> objects = List.of();
        objects.add("aa");


    }

    public static String getKey(Object... args) {
        return String.format("newest_goods_no_list_%s_%s_%s", args);
    }

}
