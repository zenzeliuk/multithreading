package com.examples.basics;

public class Example_7 {

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(getName());
                    try {sleep(500);}
                    catch (InterruptedException e) {e.printStackTrace();}}}
        }.start();
    }

}


