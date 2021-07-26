package com.examples.synchronized_examples;

public class Example_2 {

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
        Example_2 e = new Example_2();
        new Thread(() -> {
            while (true){
                e.m(false);
            }
        }).start();

        new Thread(() -> {
            while (true){
                e.m(true);
            }
        }).start();
    }
}



