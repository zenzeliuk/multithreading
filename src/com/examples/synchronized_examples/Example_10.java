package com.examples.synchronized_examples;

public class Example_10 {

    private static final Object M = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread t = Thread.currentThread();
        System.out.println(t.getState());

        new Thread() {
            @Override
            public void run() {
                synchronized (M) {
                    try {
                        sleep(500);
                        System.out.println(t.getState());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        Thread.sleep(50);

        synchronized (M) {

        }
    }
}



