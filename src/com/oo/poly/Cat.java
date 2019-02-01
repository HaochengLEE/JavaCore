package com.oo.poly;

/**
 * @author lihaocheng
 * @create 2019-01-29 7:04 PM
 **/

public class Cat extends Animal {
    private String sex;

    public Cat(){

    }

    public Cat(String name,int age,String sex){
        super(name, age);
        this.sex=sex;

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //睡觉
    public void sleep(){
        System.out.println("Cat can sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Cat can eating");
    }

    public void play() {
        System.out.println("Cat is playing");
    }
}
