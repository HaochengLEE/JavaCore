package com.oo.poly;

/**
 * @author lihaocheng
 * @create 2019-01-29 2:06 PM
 **/

public abstract class Animal {

    private String name;
    private int age;

    public Animal(){

    }

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();


}
