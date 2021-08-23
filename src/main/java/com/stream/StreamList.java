package com.stream;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static java.util.stream.Collectors.toList;

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


}
