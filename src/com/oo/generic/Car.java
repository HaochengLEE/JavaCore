package com.oo.generic;

/**
 * @author lihaocheng
 * @create 2019-03-03 15:29
 **/

public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void run(){
        System.out.println("Car is running");
    }

}
