package com.util.set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lihaocheng
 * @create 2019-02-12 10:39 PM
 **/

public class ListDemo {
    public static void main(String[] args) {
        //存储名称
        List arrayList=new ArrayList();
        arrayList.add("java");
        arrayList.add("C");
        arrayList.add("Scala");
        //输出列表中元素的个数
        int a=arrayList.size();
        System.out.println(a);
        //遍历输出List中元素
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));

        }

        System.out.println("=====remove element=====");

        //移除元素
        arrayList.remove(2);
        arrayList.remove("C");

        //遍历输出List中元素
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));

        }

    }

}
