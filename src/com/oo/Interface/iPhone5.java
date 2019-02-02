package com.oo.Interface;

/**
 * @author lihaocheng
 * @create 2019-02-02 9:58 PM
 **/

public class iPhone5 extends iPhone4 implements IPhone {
    @Override
    public void photo() {
        System.out.println("500px");
    }

    @Override
    public void connection() {
        System.out.println("It is 4G");
    }
}
