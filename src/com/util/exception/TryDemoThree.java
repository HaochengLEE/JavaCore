package com.util.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author lihaocheng
 * @create 2019-02-09 10:57 PM
 **/

public class TryDemoThree {
    public static void main(String[] args) {
        try {
            int result=test();
            System.out.println(result);
            System.out.println("====end====");
        } catch (ArithmeticException e) {
            System.out.println("cannnot use 0");
            e.printStackTrace();

        } catch (InputMismatchException e){
            System.out.println("please input number");
            e.printStackTrace();
        }


    }

    /**
     *
     * @return
     * @throws ArithmeticException
     * @throws InputMismatchException
     */
    public static int test() throws ArithmeticException,InputMismatchException{
        Scanner input=new Scanner(System.in);
        System.out.println("====start====");
        //抛出异常
        System.out.print("Input number1:");
        int a = input.nextInt();
        System.out.print("Input number2:");
        int b = input.nextInt();
        System.out.println("====result====");
        return a/b;

    }

}
