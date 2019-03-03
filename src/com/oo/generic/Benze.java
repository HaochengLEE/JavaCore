package com.oo.generic;

/**
 * @author lihaocheng
 * @create 2019-03-03 15:24
 **/

public class Benze extends Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void back(){
        System.out.println("Benze is back");
    }
}
