package com.soojong.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalMain {

    public static void main(String[] args) {

        DecimalFormat format = new DecimalFormat("#.##");

        System.out.println(format.format(12.01));
        System.out.println(format.format(12.0));
        System.out.println(format.format(12.001));
        System.out.println(format.format(12.2123));



    }

}
