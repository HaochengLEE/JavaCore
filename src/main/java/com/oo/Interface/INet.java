package com.oo.Interface;

/**
 * @author lihaocheng
 * @create 2019-02-02 11:52 AM
 **/

public interface INet {
    public void network();

    //接口中的常量，默认public static final
    int time  =  123;

    //default：默认方法，可以带方法体 可以在实现类中重写，并可以通过接口引用调用
    default void connection(){
        System.out.println("It is a formal connection");
    }



    //static：静态方法 可以带方法体 不可以在实现类中重写，可以通过接口名调用
    static void safe(){
        System.out.println("protect your phone");
    }


}
