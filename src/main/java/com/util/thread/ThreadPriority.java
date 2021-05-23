package com.util.thread;

/**
 * @author lihaocheng
 * @create 2019-02-22 5:58 PM
 **/
class ThreadTestP extends Thread{
    @Override
    public void run() {
        for(int i=1;i<11;i++){
            System.out.println(getName()+" has run "+i+" times");
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
       ThreadTestP tr1=new ThreadTestP();
       ThreadTestP tr2=new ThreadTestP();


        tr2.setPriority(Thread.MAX_PRIORITY);
        tr1.setPriority(Thread.MIN_PRIORITY);

        tr2.start();
        tr1.start();
    }

}
