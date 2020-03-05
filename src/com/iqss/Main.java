package com.iqss;

public class Main {

    // this is a test program that will  try different mechanism to execute and synchronize two methods asynchronously
    public static void main(String[] args) {
	    // write your code here

        BasicTest bt = new BasicTest();
        startRunnable();
    }

    private static void startRunnable() {
        RunnableTest rt1 = new RunnableTest();
        RunnableTest rt2 = new RunnableTest();
        rt1.run();
        rt2.run();

    }


}
