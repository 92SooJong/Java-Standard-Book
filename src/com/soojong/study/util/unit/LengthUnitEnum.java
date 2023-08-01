package com.soojong.study.util.unit;

public enum LengthUnitEnum {

    CENTIMETER("cm", 1),
    METER("m",100),
    INCH("inch",0.393701)
    ;

    private final String symbol;
    private final double scaleFromCentimeter;

    LengthUnitEnum(String symbol, double scaleFromCentimeter) {
        this.symbol = symbol;
        this.scaleFromCentimeter = scaleFromCentimeter;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getScaleFromCentimeter() {
        return scaleFromCentimeter;
    }
}
