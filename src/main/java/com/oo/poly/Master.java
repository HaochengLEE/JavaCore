package com.oo.poly;

/**
 * @author lihaocheng
 * @create 2019-02-01 11:39 AM
 **/

public class Master {
    //方案1：编写方法，传入不同类型的动物，调用各自的方法
    public void feed(Dog dog){
        dog.eat();
        dog.sleep();

    }

    public void feed(Cat cat){
        cat.eat();
        cat.play();
    }

    //方案2：编写方法传入父类，方法中通过类型转换，调用指定类型的方法
    public void feed(Animal animal){
        if(animal instanceof Cat){
            Cat temp = (Cat)animal;
            temp.eat();

        }else if(animal instanceof Dog){
            Dog temp = (Dog)animal;
            temp.eat();

        }
    }


    //
    public Dog ManyTime(){
        System.out.println("Having more time");
        return new Dog();
    }

    public Cat LessTime(){
        System.out.println("Having less time");
        return new Cat();
    }

    //
    public Animal Time(boolean a){
        if (a){
            System.out.println("Dog");
            return new Dog();
        }
        else{
            System.out.println("Cat");
            return new Cat();

        }
    }

}
