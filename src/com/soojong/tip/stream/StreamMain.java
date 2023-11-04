package com.soojong.tip.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamMain {

    public static void main(String[] args) {

        List<Test> tests = List.of(new Test("a"), new Test("b"), new Test("c"), new Test());

        Map<String, Long> collect = tests.stream()
            .map(Test::getField)
            //.filter(Objects::nonNull)
            .collect(groupingBy(alphabet -> alphabet, Collectors.counting())); // null을 필터링해주지 않으면 NPE발생 함. element cannot be mapped to a null key

    }

    public static class Test {

        public String field;


        public Test() {
        }

        public Test(String field) {
            this.field = field;
        }

        public String getField() {
            return field;
        }

        @Override
        public String toString() {
            return "Test{" +
                "field='" + field + '\'' +
                '}';
        }
    }

}
