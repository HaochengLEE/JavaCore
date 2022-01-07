package com.jdk8plus.stream;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static java.util.stream.Collectors.*;

/**
 * * @author lihaocheng
 * * @createtime 2021/8/25
 */
public class CollectData {
    @Test
    public void collectDate1(){
        List<Vo> list= new ArrayList<>();
        LocalDate localDate=LocalDate.of(2021,7,1);
        for (int i=0;i<50;i++){
            Double num=Math.random()*100;
            Vo vo=new Vo(localDate, Integer.valueOf(num.intValue()));
            localDate=localDate.plusDays(2);
            list.add(vo);
        }
        //获取最大 value 值的对象
        Comparator<Vo> comparator=Comparator.comparingInt(Vo::getValue);
        Optional<Vo> highValue=list.stream()
                .collect(maxBy(comparator));
        //获取 value 总和
        int num=list.stream()
                        .collect(summingInt(Vo::getValue));
        System.out.println(highValue);
        System.out.println(num);
    }


    @Test
    public void groupTest(){
        List<Vo> list= new ArrayList<>();
        LocalDate localDate=LocalDate.of(2021,7,1);
        list.add(new Vo(localDate,20));
        list.add(new Vo(localDate.plusDays(1),30));
        list.add(new Vo(localDate.plusDays(1),21));
        list.add(new Vo(localDate.plusDays(2),3));
        list.add(new Vo(localDate.plusDays(2),10));

        for (int i=0;i<1000;i++){
            Integer num=Integer.valueOf((int) (Math.random()*100));
            Vo vo=new Vo(localDate.plusDays(num%5), num);
            list.add(vo);
        }
        //将List按日期分组
        Map<LocalDate,Integer> map=list.stream().parallel().collect(groupingBy(Vo::getLocalDate,summingInt(Vo::getValue)));
        map.forEach((key,value)->{
            System.out.println(key);
            System.out.println(value);
        });



        //将List按月分类
//        Map<LocalDate,Integer> map1=list.stream().collect(
//                groupingBy(Vo::getLocalDate, mapping(vo->{
//            vo.
//        }).summingInt(Vo::getValue)));
    }
}
