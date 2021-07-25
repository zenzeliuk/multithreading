package com.examples.basics;

public class Example_15 {
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
            while (true){
                System.out.println(message);
                try {sleep(time);}
                catch (InterruptedException e) {break;}
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[6];
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
        Thread.sleep(3000);

        // stop interrupt
        for (Thread t : threads) {
            t.interrupt();
        }

    }
}



