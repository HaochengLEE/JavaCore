package com.oo.poly;

/**
 * @author lihaocheng
 * @create 2019-02-01 12:09 PM
 **/

public class MasterTest {
    public static void main(String[] args) {
        Master master =  new Master();
        Cat cat       =  new Cat();
        Dog dog       =  new Dog();
        master.feed(cat);
        master.feed(dog);

        boolean time=true;
        master.Time(time);

//        if (time){
//            master.ManyTime();
//
//        }else{
//            master.LessTime();
//        }

    }


}
