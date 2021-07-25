package com.examples.basics;

public class Example_16 {
    Thread[] threads;

    static class Worker extends Thread {

        private String message;
        private  int time;

        public Worker(String message, int time) {
            this.message = message;
            this.time = time;

        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(message);
                try {sleep(time);}
                catch (InterruptedException e) {e.printStackTrace();}
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[3];
//        for (Thread t : threads) {
//            t = new Worker("asdf", 333);
//        }
        for (int i = 0; i < threads.length; i++) {
            threads[i] =
                    new Worker("Message" + i, 333 *(i + 1));
        }
        
        // start
        for (Thread t : threads) {
            t.start();
        }
//        Thread.sleep(3000);
        
        // join
        for (Thread t : threads) {
            t.join();
        }

    }
}



