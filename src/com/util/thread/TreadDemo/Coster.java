package com.util.thread.TreadDemo;

/**
 * @author lihaocheng
 * @create 2019-02-23 11:13 PM
 **/

public class Coster implements Runnable {
    Queen queen;
    Coster(Queen queen){
        this.queen=queen;
    }



    @Override
    public void run() {
        int i=0;
        while(true){
            queen.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
