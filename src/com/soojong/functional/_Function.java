package com.soojong.functional;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);

        Integer apply = incrementByOneFunction.apply(1);
        System.out.println(apply);


    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static int increment(int number) {
        return number + 1;
    }


}
