package com.oo.extend;

/**
 * @author lihaocheng
 * @create 2019-01-25 10:32 PM
 **/

public class Animal {
    public Animal(){
        System.out.println("is Animal");

    }
    public Animal(String a){
        System.out.println(a+"is Animals");

    }
    public void run(){
        System.out.println("Animal can run");
    }

    public void eat(){
        System.out.println("Animal can eat");
    }

    public void sex(){
        System.out.println("Sex Animal");
    }

}
