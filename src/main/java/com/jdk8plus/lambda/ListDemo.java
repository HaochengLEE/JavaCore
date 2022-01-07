package com.jdk8plus.lambda;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * * @author lihaocheng
 * * @createtime 2021/8/27
 */
public class ListDemo {
    @Test
    public void printDemo(){
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.forEach(
                (Integer i)-> System.out.println(i)
        );
    }

    //比较重量
    @Test
    public void noPackage(){
        List<Apple> list=Arrays.asList();
        //按重量逆序
        list.sort(Comparator.comparing(Apple::getWegiht).reversed());
        //先按重量，重量相同按编号排序
        list.sort(Comparator.comparing(Apple::getWegiht).thenComparing(Apple::getCode));
    }

    @Test
    public void func(){


    }
}
