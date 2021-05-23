package com.oo.poly;

/**
 * @author lihaocheng
 * @create 2019-01-29 10:12 PM
 **/

public class PolyTest {
    public static void main(String[] args) {
        //向上转型
//        Animal one = new Animal();
        Animal two = new Cat();
        Animal three = new Dog();

//        one.eat();
        two.eat();
        three.eat();
        //这里不能调用子类独有的方法，如three.sleep();



        //instanceof运算符 ：返回true和false
        if(two instanceof Cat){
            //向下转型
            Cat temp = (Cat)two;
            temp.eat();
            temp.sleep();
            ((Cat) two).sleep();
            System.out.println("is Cat");
        }
        else if (two instanceof Dog){
            Dog temp = (Dog)two;
            temp.sleep();
            System.out.println("is Dog");
        }

    }

}
