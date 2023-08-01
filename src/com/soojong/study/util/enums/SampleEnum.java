package com.soojong.study.util.enums;

public enum SampleEnum {

    A("a",1,'a',1.0),

    B("b",2,'a',1.1);

    private final String symbol;
    private final int number;
    private final char character;
    private final double doubleNumber;

    SampleEnum(String symbol, int number, char character, double doubleNumber) {
        this.symbol = symbol;
        this.number = number;
        this.character = character;
        this.doubleNumber = doubleNumber;
    }
}
