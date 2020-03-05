package com.iqss;

public class BasicTest implements Runnable {

    public BasicTest() {
        Thread myThread1 = new Thread("Paul1");
        Thread myThread2 = new Thread("Paul2");
        myThread1.start();
        myThread2.start();
        System.out.println("Thread names are following:");
        System.out.println(myThread1.getName());
        System.out.println(myThread2.getName());
    }

    @Override
    public void run() {
        System.out.println("Run method");
    }
}
