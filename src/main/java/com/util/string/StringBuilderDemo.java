package com.util.string;

/**
 * @author lihaocheng
 * @create 2019-04-03 23:07
 **/

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str=new String("Hello");
        StringBuilder stringBuilder=new StringBuilder(str);
        //追加
        stringBuilder.append("World");
        System.out.println(stringBuilder);
        //delete insert
        stringBuilder.delete(4,6).insert(4,"GG");
        System.out.println(stringBuilder);
        //replace
        stringBuilder.replace(0,5,"FUCK");
        System.out.println(stringBuilder);

    }

}
