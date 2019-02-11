package com.util.wrapp;

/**
 * @author lihaocheng
 * @create 2019-02-11 11:21 PM
 **/

public class WarppTest {
    public static void main(String[] args) {
        //装箱
        //1.自动装箱
        int pack1=2;
        Integer pack2=pack1;
        //2.手动装箱
        Integer pack3=new Integer(pack1);
        System.out.println("pack1 value is:"+pack1);
        System.out.println("pack2 value is:"+pack2);
        System.out.println("pack3 value is:"+pack3);


        System.out.println("======================");
        //拆箱
        //1.自动拆箱
        int open1=pack3;
        //2.手动拆箱
        int open2=pack3.intValue();
        double open3=pack3.doubleValue();
        System.out.println("open1 value is:"+open1);
        System.out.println("open2 value is:"+open2);
        System.out.println("open3 value is:"+open3);
    }

}
