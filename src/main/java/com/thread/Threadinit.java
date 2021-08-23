package com.thread;

/**
 * * @author lihaocheng
 * * @createtime 2020/11/20
 */
public class Threadinit {
    static Thread thread1=new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread1");
        }
    });
    static Thread thread2=new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread2");
        }
    });
    static Thread thread3=new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("thread3");
        }
    });

    public static void main(String[] args) throws InterruptedException {
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }
}
