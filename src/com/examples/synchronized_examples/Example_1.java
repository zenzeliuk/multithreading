package com.examples.synchronized_examples;

public class Example_1 {

    boolean flag;

    void m(boolean f) {
        this.flag = f;
        try {
            Thread.sleep(333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(flag + " == " + f);
    }


    public static void main(String[] args) {
        Example_1 e = new Example_1();
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



