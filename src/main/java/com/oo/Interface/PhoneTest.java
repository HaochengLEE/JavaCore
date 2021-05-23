package com.oo.Interface;

/**
 * @author lihaocheng
 * @create 2019-02-02 10:00 PM
 **/

public class PhoneTest {
    public static void main(String[] args) {
        IPhone ip4 = new iPhone4();
        ip4.connection();
        ip4.photo();

        System.out.println("=================");
        iPhone5 ip5 = new iPhone5();
        ip5.connection();
        ip5.photo();
        ip5.showphoto();
        INet.safe();

    }

}
