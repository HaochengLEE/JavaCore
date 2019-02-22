package com.util.thread;

/**
 * @author lihaocheng
 * @create 2019-02-22 5:20 PM
 **/

public class ThreadJoin {
    public static void main(String[] args) {
        Threadbiubiu tb=new Threadbiubiu();
        tb.start();
        try {
            tb.join(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread was run");

    }

}
