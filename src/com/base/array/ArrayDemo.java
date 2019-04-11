package com.base.array;

/**
 * @author lihaocheng
 * @create 2019-04-08 23:59
 **/

public class ArrayDemo {
    public static void main(String[] args) {
        //静态初始化
        String[] a1={"abc","cca","hahah","最后一个"};
        //动态初始化，需要指定大小
        String[] a2=new String[4];
        //遍历数组一般使用foreach方法，可以在没有下标的情况下遍历数组
        //for(元素:数组名)
        for (String s:a1
             ) {
            System.out.println(s);

        }

    }

}
