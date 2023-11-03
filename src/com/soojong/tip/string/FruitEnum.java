package com.soojong.tip.string;

public enum FruitEnum {

    // C
    APPLE("color of apple is %s"),
    GRAPE("color of grape is %s"),
    ;

    private final String textPattern;

    FruitEnum(String textPattern) {
        this.textPattern = textPattern;
    }

    public String getText(Object... args) {
        return String.format(textPattern, args);
    }
}

