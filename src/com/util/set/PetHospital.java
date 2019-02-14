package com.util.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author lihaocheng
 * @create 2019-02-14 4:16 PM
 **/

public class PetHospital {
    public static void main(String[] args) {
        Set<Cat> set=new HashSet<Cat>();
        Cat cat1=new Cat("huahua","man",3);
        Cat cat2=new Cat("adai","felman",4);
        Cat cat3=new Cat("kafka","felman",3);
        //重复的元素
        Cat cat4=new Cat("kafka","felman",3);
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.remove(cat2);
        //重复的元素将不会被添加
        set.add(cat4);
        Iterator<Cat> it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
//        System.out.println(set.contains(cat1));
        //查找元素
        Cat c=null;
        boolean a=false;
        it=set.iterator();
        while (it.hasNext()){
             c=it.next();
             if(c.getName().equals("huahua")){
                 a=true;
             }else a=false;
        }

        if(a){
            System.out.println("there is huahua");
        }else System.out.println("huahua is 404");

    }

}
