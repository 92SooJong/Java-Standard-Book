package com.soojong.generics;

import java.util.ArrayList;

public class GenericsMain {

    public static void main(String[] args) {
//        IntegerPrinter integerPrinter = new IntegerPrinter(24);
//        integerPrinter.print();
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> printerForString = new Printer<>(33.5);
        printer.print();

    }
}
