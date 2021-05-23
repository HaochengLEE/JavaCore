package com.util.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author lihaocheng
 * @create 2019-02-14 3:04 PM
 **/

public class WordDemo {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("Math");
        set.add("PT");
        set.add("Shoot");
        set.add("SERE");
        //转换为迭代器
        Iterator i=set.iterator();

        //输出
        while (i.hasNext()){
            System.out.print(i.next()+"  ");
        }



    }

}
