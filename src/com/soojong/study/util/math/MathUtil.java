package com.soojong.study.util.math;

public class MathUtil {

    public static double getMultipleNumber(double number, int standardMultiple,boolean isSmallerThanNumber) {

        int rest = (int) number % standardMultiple;

        if(rest == 0) {
            return number;
        }

        if(isSmallerThanNumber) {
            return number - rest;
        } else {
            return number - rest + standardMultiple;
        }

    }



    public static void test() {
        System.out.println(Math.ceil(166));
        int number = 96;
        int lastDigitZero = (number / 10) * 10;
        int lastDigit = number%lastDigitZero;

        System.out.println("original : "+number);
        System.out.println("lastDigitZero : "+lastDigitZero);
        System.out.println("lastDigit : "+lastDigit);
        int result1 = lastDigitZero;
        if(lastDigit > 4) {
            result1 = lastDigitZero + 5;
        }
        System.out.println(result1);
        System.out.println("======================");

        int number2 = 255;
        int lastDigitZero2 = (number2 / 10) * 10;
        int lastDigit2 = number2%lastDigitZero2;
        int result2 = 0;
        System.out.println("original : "+number2);
        System.out.println("lastDigitZero : "+lastDigitZero2);
        System.out.println("lastDigit : "+lastDigit2);

        if(lastDigit2 > 4) {
            result2 = lastDigitZero2+9;
        } else {
            result2 = lastDigitZero2+4;
        }
        System.out.println(result2);


        System.out.println("======================");
        for(int s = result1; s<=result2; s=s+5 ) {
            System.out.printf("from : %d -> to : %d\n", s , s+4);
        }

    }


}
