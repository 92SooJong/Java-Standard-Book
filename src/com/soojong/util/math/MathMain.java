package com.soojong.util.math;

public class MathMain {

    public static void main(String[] args) {

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
