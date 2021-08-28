package com.stream;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * * @author lihaocheng
 * * @createtime 2021/8/22
 */
public class StreamList {
    @Test
    public void distinctTest(){
        List<Integer> numbers= Arrays.asList(1,2,3,2,1,4,6,7,8,6);
        numbers.stream()
                .filter(i->i%2==0)
                .distinct()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void takeWhileTest(){
        List<Food> foodList=new ArrayList<>();
        foodList.add(0,new Food("宫保鸡丁1",200));
        foodList.add(1,new Food("宫保鸡丁2",400));
        foodList.add(2,new Food("宫保鸡丁3",500));
        foodList.add(3,new Food("宫保鸡丁4",200));
        foodList.add(4,new Food("宫保鸡丁5",200));

        List<Food> healthFood=foodList.stream()
                .takeWhile(n->n.getCalories()<300)
                .collect(toList());
        List<Food> unhealthFood=foodList.stream()
                 .dropWhile(d->d.getCalories()<300)
                 .collect(toList());
        healthFood.stream()
                .forEach(System.out::println);

    }

    @Test
    public void mapTest(){
        List<Food> foodList=new ArrayList<>();
        foodList.add(0,new Food("宫保鸡丁1",200));
        foodList.add(1,new Food("宫保鸡丁2",400));
        foodList.add(2,new Food("宫保鸡丁3",500));
        foodList.add(3,new Food("宫保鸡丁4",200));
        foodList.add(4,new Food("宫保鸡丁5",200));

        List<String> healthFood=foodList.stream()
                .map(Food::getFoodName)
                .collect(toList());
        healthFood.stream()
                .forEach(System.out::println);
    }

    /**
     * Java实战 测验 5.2 练习1
     */
    @Test
    public void Ex1(){
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        List<Integer> result=list.stream()
                .map(n->n*n)
                .collect(toList());
        result.stream()
                .forEach(System.out::println);

    }

    /**
     * Java实战 测验 5.2 练习3
     */
    @Test
    public void Ex2(){
        List<Integer> list1=Arrays.asList(1,2,3);
        List<Integer> list2=Arrays.asList(3,4);
        List<int[]> pairs=list1.stream()
                .flatMap(i->list2.stream()
                        .map(j->new int[]{i,j}))
                .collect(toList());
        for (int[] arr:
             pairs) {
            for (int i=0;i<arr.length;i++){
                System.out.print(","+arr[i]);
            }
            System.out.println("");
        }


    }





}
