package com.soojong.study.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        Integer incrementOneByFunction = incrementByOneFunction.apply(1);
        System.out.println(incrementOneByFunction);

        Integer multiply = multipleBy10Function.apply(increment);
        System.out.println(multiply);

        // Function Chain
        Function<Integer, Integer> integerIntegerFunction = incrementByOneFunction.andThen(multipleBy10Function);
        Integer apply1 = integerIntegerFunction.apply(4);
        System.out.println(apply1);

        // BiFunction takes 2 argument and produces 1 result
        int incrementByOneAndMultiply = incrementByOneAndMultiplyBiFunction.apply(4, 100);
        System.out.println(incrementByOneAndMultiply);


    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;


    static int incrementByOne(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (number, numToMultiplyBy) -> (number + 1) * numToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

}
