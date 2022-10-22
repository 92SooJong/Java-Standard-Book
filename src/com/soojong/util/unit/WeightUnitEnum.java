package com.soojong.util.unit;

public enum WeightUnitEnum {

    GRAM("g", 1),
    KILOGRAM("kg",1000),
    POUND("lbs",0.00220462)
    ;

    private final String symbol;
    private final double scaleFromGram;

    WeightUnitEnum(String symbol, double scaleFromGram) {
        this.symbol = symbol;
        this.scaleFromGram = scaleFromGram;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getScaleFromGram() {
        return scaleFromGram;
    }
}
