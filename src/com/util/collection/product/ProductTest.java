package com.util.collection.product;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author lihaocheng
 * @create 2019-02-17 9:41 PM
 **/

public class ProductTest {
    public static void main(String[] args) {
        Map<String,Product> productList=new HashMap<String,Product>();
        Product apple=new Product("10001","apple",15);
        Product Coco=new Product("10003","Coco",5);
        Product butter=new Product("10005","butter",40);

        //add
        if(productList.containsKey(apple.getId())!=true){
            productList.put(apple.getId(),apple);

        }else{
            System.out.println("Product id is exits");
        }

        productList.put(Coco.getId(),Coco);
        productList.put(butter.getId(),butter);
        //print
        Iterator<Product> it=productList.values().iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }
        //delete
        System.out.println("delet element who value is 3");
        productList.remove("3");

        //print
        it=productList.values().iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }

        //update
        System.out.println("update element price to 50 who value is 9");
//        productList.

    }



}
