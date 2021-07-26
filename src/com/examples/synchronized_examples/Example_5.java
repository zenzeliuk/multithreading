package com.examples.synchronized_examples;

public class Example_5 {

    boolean flag;

    void m(boolean f) {
        synchronized (this) {
            this.flag = f;
            try {
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(flag + " == " + f);
        }
    }

    public static void main(String[] args) {
        Example_5 e = new Example_5();
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



