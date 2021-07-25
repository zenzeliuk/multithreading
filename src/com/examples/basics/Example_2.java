package com.examples.basics;

public class Example_2 {

    public static void main(String[] args) {
        Thread t = new Thread(new MyThread2());
        t.start();
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println(
                    Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


