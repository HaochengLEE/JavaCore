package com.util.io;

import java.io.File;
import java.io.IOException;

/**
 * @author lihaocheng
 * @create 2019-02-26 2:54 PM
 **/

public class FileDemo {
    public static void main(String[] args) {
        File file1=new File("/Users/lihaocheng/IdeaProjects/JavaCore/src/com/util/io/fuck.txt");
        if(file1.isFile()) {
            System.out.println("是文件");
        }else if(file1.isDirectory()){
            System.out.println("是文件夹");
        }else {
            System.out.println("我也不知道是啥");
        }

        File file2=new File("/Users/lihaocheng/IdeaProjects/JavaCore/src/com/util/io/","HashSet");
        if(!file2.exists()){
            //创建目录
            file2.mkdir();
            System.out.println("success");
        }else {
            System.out.println("file is exits");
        }

        File file3=new File("/Users/lihaocheng/IdeaProjects/JavaCore/src/com/util/io/fuck.txt");
        try {
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
