package com.util.thread;

/**
 * @author lihaocheng
 * @create 2019-02-19 9:44 PM
 **/
class MyThread2 extends Thread{
    public MyThread2(String name){
        super(name);

    }
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println(getName()+" Thread is run "+i+" time");

        }
    }


}
public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread2 mt1=new MyThread2("Theard1");
        MyThread2 mt2=new MyThread2("Theard2");
        mt1.run();
        mt2.run();
    }


}
