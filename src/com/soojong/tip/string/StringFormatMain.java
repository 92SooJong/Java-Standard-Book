package com.soojong.tip.string;

public class StringFormatMain {

    public static void main(String[] args) {

        System.out.println(FruitEnum.APPLE.getText("red"));
        System.out.println(FruitEnum.APPLE.getText(""));
        System.out.println(FruitEnum.APPLE.getText()); // MissingFormatArgumentException: Format specifier '%s' 발생 - compile 단계에서 확인이 안되므로 주의해서 사용해야한다!!

    }
}
