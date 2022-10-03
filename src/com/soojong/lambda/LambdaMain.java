package com.soojong.lambda;

public class LambdaMain {

    public static void main(String[] args) {

        Printable lambdaPrintable = (s) -> "Meow" + s;
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing){
        thing.print("!!");
    }

}
