package com.soojong.study.basic.exception;

public class CheckedVsUncheckedMain {

    public static void main(String[] args) {
        //readFile("myFile.txt");
        String name = null;
        printLength(name);
    }

    private static void printLength (String myString){
        // NullPointerException is unchecked exception
        System.out.println(myString.length());
    }

    private static void readFile (String fileName){
        // It could throw FileNotFound Exception. we need to deal with this possibility.
        // FileNotFound is checked exception.
        //FileReader reader = new FileReader(fileName);
    }

}
