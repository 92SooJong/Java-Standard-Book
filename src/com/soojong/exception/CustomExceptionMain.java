package com.soojong.exception;

public class CustomExceptionMain {

    public static void main(String[] args) {
        validateAge(-1);
    }

    private static void validateAge(int age){
        if(age < 0 ){
            throw new AgeLessThanZeroException("Oh no!",new RuntimeException());
        }
    }

}
