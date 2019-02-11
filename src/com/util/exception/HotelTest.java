package com.util.exception;

import java.util.Scanner;

/**
 * @author lihaocheng
 * @create 2019-02-10 2:26 PM
 **/

public class HotelTest {
    public static void main(String[] args) {
        try {
            login();
        } catch (HotelAgeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void login() throws Exception {

        System.out.println("Input coustemer age");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        if(age<18||age>80){
            throw new HotelAgeException();

        }else{
            System.out.println("welcome to hotel");
        }



    }

}
