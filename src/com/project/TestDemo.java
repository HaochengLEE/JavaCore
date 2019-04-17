package com.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lihaocheng
 * @create 2019-04-16 00:07
 **/

public class TestDemo {
    public static void main(String[] args) {




            System.out.println("****************************");
            System.out.println("请输入对应的数字");
            System.out.println("1-图书信息查询");
            System.out.println("2-添加图书信息");
            System.out.println("3-更新图书信息");
            System.out.println("4-删除图书信息");
            Scanner in=new Scanner(System.in);
            int a=in.nextInt();

            TestDemo.hello(a);
            System.out.println("查询完备 按0任意键继续");









    }
    public static void hello(int a){
        System.out.println("欢迎来到图书馆");
        switch (a){
            case 1:
                System.out.println("开始查询");
                break;
            case 2:
                System.out.println("开始添加");
                break;
            case 3:
                System.out.println("开始更新");
                break;
            case 4:
                System.out.println("开始删除");
                break;


        }



    }

}
