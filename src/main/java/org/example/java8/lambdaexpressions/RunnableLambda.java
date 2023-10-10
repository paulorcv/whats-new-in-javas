package org.example.java8.lambdaexpressions;

public class RunnableLambda {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println(i + "-> Hello world from thread [" + Thread.currentThread().getName() + "]");
            }
        };


        Thread t = new Thread(runnable);
        t.start();
        t.join();

    }

}
