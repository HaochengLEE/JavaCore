package com.util.thread.TreadDemo;

/**
 * @author lihaocheng
 * @create 2019-02-23 11:10 PM
 **/

public class Queen {

    private int count;

    public int get(){
        System.out.println("cost"+count);
        return count;
    }

    public void set(int count){
        System.out.println("add"+count);
        this.count= count;
    }

}
