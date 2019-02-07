package com.oo.innerclass;

/**
 * @author lihaocheng
 * @create 2019-02-03 3:25 PM
 **/

public class PersonTest {
    public static void main(String[] args) {

        //获取内部类对象实例
        //方式1：new外部类，new内部类
        Person.Heart p=new Person().new Heart();
        p.beat();
        System.out.println(p.beat());



        //方式2：通过外部类提供的方法
        Person p1=new Person();
        Person.Heart p2=p1.getHeart();

        //方式3：通过外部类对象new内部类
        Person p3=new Person();
        Person.Heart p4=p3.new Heart();



        p4.add();
        p2.add();
        System.out.println("===================");
        //子类可以调用父类的成员属性，若出现同名属性，优先访问内部类中的
        System.out.println(p2.age);
        System.out.println(p4.age);
        //可以使用外部类.this.成员的方式，访问外部类中同名的信息


        System.out.println("===================");
        Person.Heart2 h2=new Person.Heart2();
        h2.say();

        System.out.println("===================");
        //如果需要访问外部类中的静态属性，则可以通过 外部类.属性 的方式
        System.out.println(Person.name);

        System.out.println("===================");
        //如果需要访问外部类中的非静态属性，则可以通过 new 外部类().属性 的方式
        System.out.println(new Person().age);

    }

}
