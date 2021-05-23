package com.oo.extendaction;

/**
 * @author lihaocheng
 * @create 2019-01-29 11:47 AM
 **/

public class SingletTest {
    public static void main(String[] args) {
        //此时不能进行这样的实例化 SingletonOne one= new SingletonOne();
        SingletonOne one = SingletonOne.getSingletOne();
        SingletonOne two = SingletonOne.getSingletOne();
        System.out.println(one);
        System.out.println(two);
        SingletonTwo one1 = SingletonTwo.getInstance();
        SingletonTwo two1 = SingletonTwo.getInstance();
        System.out.println(one1);
        System.out.println(two1);
    }

}
