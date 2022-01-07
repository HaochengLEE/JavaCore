package com.jdk8plus.optional.demo1;

import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * * @author lihaocheng
 * * @createtime 2021/8/24
 */
public class PersonTest {
    @Test
    void test() {
        Person p=new Person();
        Optional<Person> person=Optional.of(p);
        p.setName("赵四");
        System.out.println(p.toString());
//        Car name=person.flatMap(Person::getCar).orElse(new Car());
//        String car=person.flatMap(Person::getName)

//        System.out.println(name);
    }
}
