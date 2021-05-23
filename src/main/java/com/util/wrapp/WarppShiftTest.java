package com.util.wrapp;

/**
 * @author lihaocheng
 * @create 2019-02-12 12:13 PM
 **/

public class WarppShiftTest {

    public static void main(String[] args) {
        //基本数据类型转换为字符串
        int st1=2;
        String st2=Integer.toString(st1);
        //测试
        System.out.println("st2:"+st2);
        //字符串转换为基本数据类型
        //1.包装类parse
        int st3=Integer.parseInt(st2);

        //2.包装类的valueOf 先将字符串转换为包装类，再通过自动拆箱完成基本类型转换
        int st4=Integer.valueOf(st2);

        //测试
        System.out.println("st3:parse"+st3);
        System.out.println("st4:valueof"+st4);
    }

}
