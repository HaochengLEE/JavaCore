package com.util.io;

import java.io.File;
import java.io.IOException;

/**
 * @author lihaocheng
 * @create 2019-02-26 2:54 PM
 **/

public class FileDemo {
    public static void main(String[] args) {
        File file1=new File("../src/com/util/io/score.txt");

        //file or
        System.out.println(file1.isFile());

        System.out.println(file1.isDirectory());

        File file2=new File("../","HashSet");
        if(!file2.exists()){
            file2.mkdir();
            System.out.println("success");
        }else {
            System.out.println("file is exits");
        }

        File file3=new File("/");
        try {
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
