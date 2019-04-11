package com.base.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lihaocheng
 * @create 2019-04-09 00:11
 **/

public class ArraysDemo {
    public static void main(String[] args) {
        String[] a1={"abc","cca","hahah","最后一个"};
        List<String> stringList=new ArrayList<>();
        stringList.add("haha");
        stringList.add("xixi");
        stringList.add("hehe");


        List<String> list = Arrays.asList(a1);



        for (String a:list
             ) {
            System.out.println(a.toString());

        }

    }




}
