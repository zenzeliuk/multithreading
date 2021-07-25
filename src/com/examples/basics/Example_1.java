package com.examples.basics;

public class Example_1 {

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println(getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


