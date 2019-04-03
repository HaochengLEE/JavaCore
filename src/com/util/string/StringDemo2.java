package com.util.string;

import java.io.UnsupportedEncodingException;

/**
 * @author lihaocheng
 * @create 2019-04-03 21:52
 **/

public class StringDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str=new String("Java Core");

        byte[] arrs=str.getBytes("GBK");
        for(int i=0;i<arrs.length;i++){
            System.out.printf(arrs[i]+" ");
        }

        String str1=new String(arrs,"GBK");
        System.out.println(str1);

    }

}
