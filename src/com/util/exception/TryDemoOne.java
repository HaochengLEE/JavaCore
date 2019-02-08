package com.util.exception;

import java.util.Scanner;

/**
 * @author lihaocheng
 * @create 2019-02-08 11:20 PM
 **/

public class TryDemoOne {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("====start====");
        //抛出异常
        try {
            System.out.print("Input number1:");
            int a = input.nextInt();
            System.out.print("Input number2:");
            int b = input.nextInt();
            System.out.println("====result====");
            System.out.println("Result:"+(a/b));
        }
        //捕获异常
        catch (Exception e){

            System.out.print("Result:Error number:");
            e.printStackTrace();

        }
        //一定会执行
        finally {
            System.out.println("====end====");

        }



    }

}
