package com.soojong.util.unit;

public class UnitMain {

    public static void main(String[] args) {

        System.out.printf("%dcm => %f inch\n",20,UnitUtil.convertCentimeterToInch(20));

        System.out.printf("%d inch => %f cm\n",1,UnitUtil.convertInchToCentimeter(1));

        System.out.printf("%dkg => %f lb\n",84,UnitUtil.convertKilogramToPound(84));

        System.out.printf("%dlbs => %f kg\n",10,UnitUtil.convertPoundToKilogram(10));




    }
}
