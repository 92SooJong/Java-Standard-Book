package com.soojong.util.enums;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class EnumUtil {


    public static <E,V>  boolean hasEnumFieldValue( Class<E> enumClass , String fieldName, V value ) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {

        Class<?> clazz = Class.forName(enumClass.getName()); // enum name with package path
        Object[] enumConstants = clazz.getEnumConstants();
        for (Object enumConstant : enumConstants) { // Enum 순회

            Field field = enumConstant.getClass().getDeclaredField(fieldName); // Enum의 fieldName 필드가져오기

            if(!Modifier.isPublic(field.getModifiers())){
                field.setAccessible(true);
            }
            Object o = field.get(enumConstant); // fieldName 필드의 값 가져오기
            if(o.equals(value)) {
                return true;
            }
        }
        return false;
    }


    public static <E extends Enum<E>,V>  E getEnumByFieldValue( Class<E> enumClass , String fieldName, V value ) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {

        Class<?> clazz = Class.forName(enumClass.getName());
        Object[] enumConstants = clazz.getEnumConstants();
        for (Object enumConstant : enumConstants) { // Enum 순회

            Field field = enumConstant.getClass().getDeclaredField(fieldName); // Enum의 fieldName 필드가져오기

            if(!Modifier.isPublic(field.getModifiers())){
                field.setAccessible(true);
            }
            Object o = field.get(enumConstant); // fieldName 필드의 값 가져오기

            if(o.equals(value)) {
                return (E) enumConstant;
            }
        }
        return null;
    }


}
