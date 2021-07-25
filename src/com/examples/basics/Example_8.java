package com.examples.basics;

public class Example_8 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(getName());
                    try {sleep(500);}
                    catch (InterruptedException e) {e.printStackTrace();}}}
        };
        t.start();
        Thread.sleep(2000);
        t.stop();

    }
}


