package com.examples.basics;

public class Example_11 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();

        Thread.sleep(1555);

        t.interrupt();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Child");
                try {
                    sleep(333);
                } catch (InterruptedException e) {
                    return;
              //      break;
                }
            }
        }
    }
}


