package com.util.collection.List;

import java.util.ArrayList;

/**
 * @author lihaocheng
 * @create 2019-04-09 00:06
 **/

public class ArrayListDemo {
    public static void main(String[] args) {
        //ArrayList用于定义动态数组，它不需要指定数组大小
        //与他类似的还有Vector但是他是线程安全，效率低下
        ArrayList arrayList=new ArrayList();
        System.out.println(arrayList.size());
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(1);
        System.out.println( arrayList.size());

    }




}
