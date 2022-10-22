package com.soojong.util.unit;

import java.text.DecimalFormat;

public class UnitUtil {

    public static double convertCentimeterToInch(double centimeter) {
        return (double) Math.round(centimeter * LengthUnitEnum.INCH.getScaleFromCentimeter() * 100) / 100;
    }

    public static double convertInchToCentimeter(double inch) {
        return (double) Math.round(inch / LengthUnitEnum.INCH.getScaleFromCentimeter() * 100) / 100;
    }

    public static double convertKilogramToPound(double kilogram) {

        double pound = (kilogram * WeightUnitEnum.KILOGRAM.getScaleFromGram()) * WeightUnitEnum.POUND.getScaleFromGram();

        return (double) Math.round(pound * 100) / 100;
    }

    public static double convertPoundToKilogram(double pound) {
        // pound to gram
        double kilogram = (pound / WeightUnitEnum.POUND.getScaleFromGram()) / WeightUnitEnum.KILOGRAM.getScaleFromGram();
        return (double) Math.round(kilogram * 100) / 100;

    }


}
