package com.oo.innerclass;

/**
 * @author lihaocheng
 * @create 2019-02-03 3:14 PM
 **/

public class Person {
    int age=123;

    public Heart getHeart(){
        return new Heart();
    }

    public void add(){
        System.out.println("anpai");
    }


    //成员内部类
    class Heart{
        int age=233;
        public String beat(){
            return Person.this.age+"Heart is beating";
        }

        public void add(){
            System.out.println("anpaixiaolaodi");
        }
    }
}
