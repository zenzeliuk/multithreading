package com.examples.basics;

public class Example_5 {

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(getName());
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    static class MyThread5 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Child");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


