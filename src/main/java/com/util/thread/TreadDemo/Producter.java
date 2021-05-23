package com.util.thread.TreadDemo;

/**
 * @author lihaocheng
 * @create 2019-02-23 11:12 PM
 **/

public class Producter implements Runnable {
    Queen queen;

    Producter(Queen queen){
        this.queen=queen;
    }

    @Override
    public void run() {
        int i=0;
        while(true){
            queen.set(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
