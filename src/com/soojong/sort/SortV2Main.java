package com.soojong.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortV2Main {

    public static void main(String[] args) {

        Comparator<Integer> integerComparator = (o1, o2) -> {return o1 - o2;};

        Stream<Integer> integerStream = Stream.of(5, 1);

        Stream<Integer> sorted = integerStream.sorted(integerComparator);

        List<Integer> list = sorted.toList();

        for (Integer integer : list) {
            System.out.println(integer);
        }


    }
}
