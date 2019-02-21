package com.util.thread;

/**
 * @author lihaocheng
 * @create 2019-02-21 11:24 PM
 **/
class Threadbiubiu extends Thread{

    @Override
    public void run() {
        int a=0;
        for(a=0;a<10;a++){
            System.out.println(getName()+" is running. That`s "+a+" times");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        Threadbiubiu tb1=new Threadbiubiu();
        Threadbiubiu tb2=new Threadbiubiu();
        tb1.start();
        tb2.start();

    }


}
