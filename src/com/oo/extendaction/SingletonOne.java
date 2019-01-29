package com.oo.extendaction;

/**
 * @author lihaocheng
 * @create 2019-01-29 12:23 AM
 **/

//饿汉式：创建对象实例的时候直接初始化 空间换时间
public class SingletonOne {
    //1.创建类中的私有构造
    private SingletonOne(){

    }

    //2.创建该类的私有化静态实例
   private static SingletonOne instance = new SingletonOne();


    //3.创建公有静态方法
    public static SingletonOne getSingletOne(){
        return instance;
    }


}
