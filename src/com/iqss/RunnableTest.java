package com.iqss;

// Needs to do more to be a thread!
// Is there a way to inherit thread better?
public class RunnableTest implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running?");
    }
}
