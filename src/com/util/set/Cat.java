package com.util.set;

import java.util.Objects;

/**
 * @author lihaocheng
 * @create 2019-02-14 4:14 PM
 **/

public class Cat {
    private String name;
    private String sex;
    private int age;

    public Cat(){

    }
    public Cat(String name,String sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "姓名：'" + name + '\'' +
                ", 性别：'" + sex + '\'' +
                ", 年龄：" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (o.getClass()==Cat.class){
            Cat cat = (Cat)o;
            return cat.getName().equals(name)&&(cat.getSex().equals(sex))&&(cat.getAge()==age);
        }
        return false;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, sex, age);
    }
}
