package com.examples.basics;

public class Example_3 {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        try {
            t.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t);

    }
}



