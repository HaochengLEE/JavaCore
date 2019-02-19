package com.util.thread;

/**
 * @author lihaocheng
 * @create 2019-02-19 10:02 PM
 **/
class MyThread3 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is run");

    }

}
public class Thread2 {
    public static void main(String[] args) {
        MyThread3 mt1=new MyThread3();
        Thread t1=new Thread(mt1);
        t1.start();
        MyThread3 mt2=new MyThread3();
        Thread t2=new Thread(mt2);
        t2.start();
    }

}
