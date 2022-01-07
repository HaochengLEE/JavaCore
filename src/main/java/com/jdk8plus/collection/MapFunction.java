package com.jdk8plus.collection;


import org.junit.jupiter.api.Test;

import java.util.Map;

import static java.util.Map.entry;

/**
 * * @author lihaocheng
 * * @createtime 2021/8/26
 */
public class MapFunction {
    @Test
    public void nullMap(){
        Map<String,String> map=Map.ofEntries(entry("k01","华哥"),entry("k03","老八"));
        System.out.println(map.getOrDefault("k04","查无此人"));
        System.out.println(map.getOrDefault("k03","查无此人"));
    }


    @Test
    public void computeMap(){
        Map<String,String> map=Map.ofEntries(entry("k01","华哥"),entry("k03","老八"));
//        map.forEach(line->map.computeIfAbsent(line,));
    }

    private void add(Map<String,Integer> map,String name,Integer num){
        map.merge(name,0,(key,count)->count+num);
    }

    @Test
    public void mergeTest(){
        Map<String,Integer> map=Map.ofEntries(entry("k01",1),entry("k03",2));
        add(map,"k01",5);
        add(map,"k02",5);
        map.forEach((key,value)->{
            System.out.println("key="+key);
            System.out.println("value="+value);
        });

    }
}
