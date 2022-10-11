package com.soojong.util.enums;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class EnumMain {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {


        boolean value = EnumUtil.hasEnumFieldValue(SampleEnum.class, "character", '2');
        System.out.println(value);
        SampleEnum o = EnumUtil.getEnumByFieldValue(SampleEnum.class, "doubleNumber", 1);
        System.out.println(o);


    }
}
