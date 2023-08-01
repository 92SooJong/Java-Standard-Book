package com.soojong.study.basic.array;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {

        // 선언은 2가지 방법으로 가능
        // 선언은 배열을 다루기 위한 참조변수를 위한 공간만 만들어지는 것임.
        int[] score;
        int score2[];

        String[] name;
        String name2[];

        // 배열 생성을 위해서 길이를 지정해줘야 한다.
        // 각 배열의 요소는 모두 0으로 값 세팅이 된다.
        int[] scoreArray = new int[5];

        // 배열 생성과 동시에 초기화
        int[] scoreArray2 = new int[]{10,20,30,40,50};
        // 생성과 동시에 초기화 하는 경우만 new int[] 생략가능.
        int[] scoreArray3 = {10,20,30,40,50};

        // 배열의 출력
        System.out.println(Arrays.toString(scoreArray3));

        // 배열의 복사
        int[] extendedScore= new int[10];
        for (int i = 0; i < scoreArray3.length; i++) {
            extendedScore[i] = scoreArray3[i];
        }

        // scoreArray3의 참조변수는 extendScore참조 변수가 된다.
        // 기존에 scoreArray3이 가르키고 있던 값들은 JVM에 의해 GC된다.
        scoreArray3 = extendedScore;



    }

}
