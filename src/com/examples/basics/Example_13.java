package com.examples.basics;

public class Example_13 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread13();
        t.start();
        t.join();
        System.out.println("OK");
    }
}

class MyThread13 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child");
            try {sleep(333);}
            catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}


