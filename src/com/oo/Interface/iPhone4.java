package com.oo.Interface;

/**
 * @author lihaocheng
 * @create 2019-02-02 9:57 PM
 **/

public class iPhone4 implements IPhone {

    @Override
    public void network() {


    }

    @Override
    public void photo() {
        System.out.println("400px");

    }

    @Override
    public void connection() {
        System.out.println("It is 3G");

    }
}
