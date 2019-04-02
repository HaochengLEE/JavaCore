package com.util.string;

/**
 * @author lihaocheng
 * @create 2019-04-02 23:49
 **/

public class StringObjDemo {
    public static void main(String[] args) {
        String str=new String("HaHahaha cao haha");
        // 查找第一次出现位置
        System.out.println("字符\"h\"在字符串最初的位置"+str.indexOf('a'));
        //
        System.out.println("字符串\"haha\"在字符串最早的位置"+str.indexOf("haha"));

        System.out.println("字符\"h\"在字符串的最后位置"+str.lastIndexOf('h'));

        System.out.println("字符串\"haha\"在字符串最后的位置"+str.lastIndexOf("haha"));

    }

}
