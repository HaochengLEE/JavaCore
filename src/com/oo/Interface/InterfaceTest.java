package com.oo.Interface;

/**
 * @author lihaocheng
 * @create 2019-02-02 12:05 PM
 **/

public class InterfaceTest {
    public static void main(String[] args) {
        IPhoto ip=new Telphone();
        Telphone tp=new Telphone();
        tp.connection();
        INet in=new Telphone();
        System.out.println(in.time);

    }



}
