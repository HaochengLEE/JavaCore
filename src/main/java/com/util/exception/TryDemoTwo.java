package com.util.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author lihaocheng
 * @create 2019-02-09 10:53 PM
 **/

public class TryDemoTwo {
    public static void main(String[] args) {
        int result=test();
        System.out.println(result);
        System.out.println("====end====");


    }

    public static int test(){
        Scanner input=new Scanner(System.in);
        System.out.println("====start====");
        //抛出异常
        try {
            System.out.print("Input number1:");
            int a = input.nextInt();
            System.out.print("Input number2:");
            int b = input.nextInt();
            System.out.println("====result====");
            return a/b;
        }
        //捕获异常
        catch (ArithmeticException e){
            System.out.println("Result:Error:Can not use 0");
            return 0;

        }
        catch (InputMismatchException e){
            System.out.println("Result:Error:Please enter number");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        //一定会执行
        return 0;



    }

}
