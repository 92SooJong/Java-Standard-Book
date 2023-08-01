package com.soojong.study.basic.generics;

public class MultiPrinter<T,V> {
    T thingToPrint;
    V otherThing;

    public MultiPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
