package com.examples.synchronized_examples;

public class Example_4 {

    boolean flag;

    synchronized void m(boolean f) {
        this.flag = f;
        try {
            Thread.sleep(333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(flag + " == " + f);
    }

    public static void main(String[] args) {
        Example_4 e = new Example_4();
        Example_4 e2 = new Example_4();
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
                e2.m(true);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }).start();
    }
}



