package com.soojong.study.util.enums;

public class EnumMain {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {


        boolean value = EnumUtil.hasEnumFieldValue(SampleEnum.class, "character", '2');
        System.out.println(value);
        SampleEnum o = EnumUtil.getEnumByFieldValue(SampleEnum.class, "doubleNumber", 1);
        System.out.println(o);


    }
}
