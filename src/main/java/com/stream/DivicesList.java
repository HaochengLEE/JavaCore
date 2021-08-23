package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * * @author lihaocheng
 * * @createtime 2021/5/31
 */
public class DivicesList {
    public static void main(String[] args) {
        //构造一个List
        List<Divices> divicesList=new ArrayList(100);
        for (int i=0;i<50;i++) {
            Divices divices=new Divices();
            divices.setId((int) (Math.random() * (100-1)));
            divices.setPrice((int) (Math.random() * (100-1)));
            divices.setName("price" + divices.getPrice());
            divices.setStatus(true);
            divicesList.add(divices);
        }
        if (divicesList.size()==0){
            return;
        }
        //未使用Stream的迭代，输出id小于30的
        List<String> lowNumList=new ArrayList<>();
        for (Divices divices:divicesList
             ) {
            if (divices.getPrice()<30){
                lowNumList.add(divices.getName());
            }

        }
        for (String a:
             lowNumList) {
            System.out.println(a);
        }
        System.out.println("________________________***_________________________");
        //使用Stream直接进行迭代，输出小于30的id值
        List<String> low=
                divicesList.stream()
                        .filter(d->d.getPrice()<30)
                        .map(Divices::getName)
                        .limit(3)
                        .collect(toList());
        for (String a:
                low) {
            System.out.println(a);
        }

    }



}
