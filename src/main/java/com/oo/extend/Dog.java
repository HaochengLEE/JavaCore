package com.oo.extend;

/**
 * @author lihaocheng
 * @create 2019-01-25 10:33 PM
 **/

public class Dog extends Animal{
    public Dog(){
        System.out.println("is Dog");

    }
    public Dog(String a){
        System.out.println(a+"is Dog");

    }
    @Override
    public void run(){
        System.out.println("dog can run");
    }
    @Override
    public void eat(){
//        super.eat();
        System.out.println("Dog can eat");
    }

}
