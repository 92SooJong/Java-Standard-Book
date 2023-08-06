package com.soojong.study.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * 이펙티브 자바 아이템 78의 예제 코드입니다. (공유 중인 가변 데이터는 동기화해 사용하라)
 */
public class StopThreadMain {

    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {

        Thread backgroundThread = new Thread(() -> {
           int i = 0;
           while (!stopRequested) {
               i++;
           }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }

}
