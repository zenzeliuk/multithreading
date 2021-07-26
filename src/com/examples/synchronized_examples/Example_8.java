package com.examples.synchronized_examples;

public class Example_8 {

    static boolean flag;

    static void m(boolean f) {
        synchronized (Example_8.class) {
            flag = f;
            try {
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(flag + " == " + f);
        }
    }

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                m(false);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                m(true);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }).start();
    }
}



