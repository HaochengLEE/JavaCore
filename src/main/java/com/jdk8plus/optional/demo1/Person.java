package com.jdk8plus.optional.demo1;

import java.util.Optional;

/**
 * * @author lihaocheng
 * * @createtime 2021/8/24
 */
public class Person {
    private String name;
    private Optional<Car> car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Car> getCar() {
        return car;
    }

    public void setCar(Optional<Car> car) {
        this.car = car;
    }
}
