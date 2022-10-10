package com.soojong.basic.generics;

public class GenericsMain {

    public static void main(String[] args) {
//        IntegerPrinter integerPrinter = new IntegerPrinter(24);
//        integerPrinter.print();
//        Printer<Integer> printer = new Printer<>(23);
//        printer.print();
//
//        Printer<Double> printerForString = new Printer<>(33.5);
//        printerForString.print();

        Printer<Cat> catPrinter = new Printer<>(new Cat());
        catPrinter.print();

        Printer<Dog> dogPrinter = new Printer<>(new Dog());
        dogPrinter.print();
    }
}
