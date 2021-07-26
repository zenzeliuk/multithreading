package com.examples.synchronized_examples;

public class Example_11 {

    private static final Object M = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (M){
                    System.out.println("Child is finish");
                }
            }
        };

        synchronized (M) {
            t.start();
            while (t.getState() != Thread.State.BLOCKED){
                System.out.println(t.getState());
            };
            System.out.println(t.getState());

            System.out.println("Main frees Monitor");
        }
        //1:30
    }
}



