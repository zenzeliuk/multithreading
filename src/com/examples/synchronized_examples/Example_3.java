package com.examples.synchronized_examples;

public class Example_3 {

    boolean flag;

    synchronized void m(boolean f) { // monitor is object Example_3 e
        this.flag = f;
        try {
            Thread.sleep(333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(flag + " == " + f);
    }

    public static void main(String[] args) {
        Example_3 e = new Example_3();
        new Thread(() -> {
            while (true) {
                e.m(false);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                e.m(true);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }).start();
    }
}



