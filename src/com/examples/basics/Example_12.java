package com.examples.basics;

public class Example_12 {
    /*
    interrupt() - піднімає флаг перепивання вверх (true).
    isInterrupted() - повертає значення флагу (true of false).
    static interrupted() - впливає на потік який це виконає,
        повертає значення флагу + скидає його до --> false.
     */

    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();

        Thread.sleep(1555);

        t.interrupt();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                System.out.println("Child");
                try {
                    sleep(333);
                } catch (InterruptedException e) {
                    interrupt();
                }
            }
        }
    }
}


