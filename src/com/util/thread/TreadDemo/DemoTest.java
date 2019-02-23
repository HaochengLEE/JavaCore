package com.util.thread.TreadDemo;

/**
 * @author lihaocheng
 * @create 2019-02-23 11:21 PM
 **/

public class DemoTest {
    public static void main(String[] args) {
        Queen queen=new Queen();
        new Thread (new Producter(queen)).start();
        new Thread (new Coster(queen)).start();
    }

}
