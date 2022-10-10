package com.soojong.basic.generics;

public class Cat extends Animal{

    private String littlePreference;

    public Cat (String name) {
        this.name = name;
    }

    public Cat() {
    }

    public String getLittlePreference() {
        return littlePreference;
    }

    public void setLittlePreference(String littlePreference) {
        this.littlePreference = littlePreference;
    }
}
