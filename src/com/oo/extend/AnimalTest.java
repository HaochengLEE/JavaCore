package com.oo.extend;

/**
 * @author lihaocheng
 * @create 2019-01-25 10:35 PM
 **/

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Tigter();
        Animal c = new Dog("AAA");
        System.out.println("=====d=======");
        Animal d = new Dog("AAA");
        //equals方法，比较两个引用是否指向同一对象
        System.out.println("=====equals=======");
        boolean flag = d.equals(c);
        System.out.println(flag);
        System.out.println(c==d);


//        a.run();
//        a.eat();
//        b.sex();
//        b.run();
    }

}
