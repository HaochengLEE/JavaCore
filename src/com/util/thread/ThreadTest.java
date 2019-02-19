package com.util.thread;

/**
 * @author lihaocheng
 * @create 2019-02-19 9:20 PM
 **/

class MyThread extends Thread{
    public void run(){
        System.out.println(getName()+" thread is run!");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("mian thread 1");
        MyThread myThread=new MyThread();
        //start thread
        //one thread just started once
        myThread.start();
        System.out.println("mian thread 2");

    }

}
