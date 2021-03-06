package com.examples.basics;

public class Example_7 {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(getName());
                    try {sleep(500);}
                    catch (InterruptedException e) {e.printStackTrace();}}}
        };
        t.setDaemon(true);
        t.start();

        System.out.println("Main is going to sleep");
        Thread.sleep(1500);
        System.out.println("Main is stopped");
    }

}


