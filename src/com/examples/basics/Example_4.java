package com.examples.basics;

public class Example_4 {

    public static void main(String[] args) {
        Thread t = new MyThread4();
        t.start();
    }
}

class MyThread4 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


