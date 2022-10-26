package com.soojong.functional;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);

        Integer incrementOneByFunction = incrementByOneFunction.apply(1);
        System.out.println(incrementOneByFunction);

        Integer multiply = multipleBy10Function.apply(increment);
        System.out.println(multiply);


        // chaining
        Function<Integer, Integer> integerIntegerFunction = incrementByOneFunction.andThen(multipleBy10Function);
        Integer apply1 = integerIntegerFunction.apply(4);
        System.out.println(apply1);

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;


    static int increment(int number) {
        return number + 1;
    }


}
