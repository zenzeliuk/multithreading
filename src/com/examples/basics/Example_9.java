package com.examples.basics;

public class Example_9 {

    public static void main(String[] args) throws InterruptedException {
        Thread tt = Thread.currentThread();

        System.out.println(tt.isInterrupted());
        System.out.println(tt.isInterrupted());

        tt.interrupt();
        Thread.sleep(500);

        System.out.println(tt.isInterrupted());
        System.out.println(tt.isInterrupted());

        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());


    }
}


