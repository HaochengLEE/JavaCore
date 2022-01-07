package com.jdk8plus.stream;



import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * * @author lihaocheng
 * * @createtime 2021/8/25
 */
public class NameList {
    /**
     * list 利用正则过滤 String
     */
    @Test
    public void filter1(){
        List<String> list= Arrays.asList("张三","赵四","YJ0843","YJ1067","YJ1085","YA1M1289","2020010101010","老王","YJ1033");
        List<String> afterList=list.stream()
                .parallel()
                .filter(p->p.matches("^YJ[0-9]{4}$"))
                .collect(Collectors.toList());
        afterList.stream().forEach(System.out::println);

    }
}
