package com.examples.basics;

public class Example_14 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();

        new Thread(){
            public void run() {
                try {sleep(1555);}
                catch (InterruptedException e) {e.printStackTrace();}
                t.interrupt();}
        }.start();

        System.out.println("before");
        try {
            t.join();
        } catch (InterruptedException e){
            System.out.println("Interrupt");
        }
        System.out.println("OK");
    }
}



