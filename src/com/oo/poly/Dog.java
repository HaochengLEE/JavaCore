package com.oo.poly;

/**
 * @author lihaocheng
 * @create 2019-01-29 10:05 PM
 **/

public class Dog extends Animal{
    private String weight;

    public Dog(){}

    public Dog(String name,int age,String weight){
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);

    }


    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void sleep(){
        System.out.println("Dog can sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Dog can eating");;
    }
}
