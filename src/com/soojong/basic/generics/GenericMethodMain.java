package com.soojong.basic.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodMain {

    public static void main(String[] args) {
        shout("John", 74);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        //printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);


    }

    private static void printList (List<? extends Animal> myList) {
        System.out.println();
    }

    private static <T,V> T shout (T thingToShout,V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!");
        System.out.println(otherThingToShout + "!!!!!!");

        return thingToShout;
    }



}
