package com.soojong.util.unit;

public class UnitUtil {

    public static double convertCentimeterToInch(double centimeter) {
        return (double) Math.round(centimeter * LengthUnitEnum.INCH.getScaleFromCentimeter() * 100) / 100;
    }

    public static double convertInchToCentimeter(double inch) {
        return (double) Math.round(inch / LengthUnitEnum.INCH.getScaleFromCentimeter() * 100) / 100;
    }

    public static double convertKilogramToPound(double kilogram) {
        return (kilogram * WeightUnitEnum.KILOGRAM.getScaleFromGram()) * WeightUnitEnum.POUND.getScaleFromGram();
    }



}
