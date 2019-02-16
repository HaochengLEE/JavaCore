package com.util.set;

import sun.invoke.empty.Empty;

import java.util.*;

/**
 * @author lihaocheng
 * @create 2019-02-16 11:13 PM
 **/

public class DictionaryDemo {
    public static void main(String[] args) {
        Map<String,String> animal=new HashMap<String,String>();
        Scanner input=new Scanner(System.in);
        int i=0;
        //scanf
        while (i<3){
            System.out.println("Please enter key");
            String key=input.next();
            System.out.println("Please enter value");
            String value=input.next();
            animal.put(key,value);
            i++;
        }
        //print
        Iterator<String> it=animal.values().iterator();
        while (it.hasNext()){

            System.out.println(it.next());

        }
        //use the entrySet to print
        Set<Map.Entry<String,String>> entrySet=animal.entrySet();
        for(Map.Entry<String,String> entry:entrySet){
            System.out.print(entry.getKey()+"-");
            System.out.println(entry.getValue());
        }

        //find the value by the key
        System.out.println("Please enter key for finding value");
        String a=input.next();
        String v=animal.get(a);
        System.out.println("value is"+" "+v);



    }


}
