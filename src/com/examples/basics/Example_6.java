package com.examples.basics;

public class Example_6 {

    public static void main(String[] args) throws InterruptedException {

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(getName());
                    try {sleep(500);}
                    catch (InterruptedException e) {e.printStackTrace();}}}
        }.start();
        System.out.println("Main is going to sleep");
        Thread.sleep(1500);
        System.out.println("Main is stopped");
    }

}


