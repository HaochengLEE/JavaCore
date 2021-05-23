package com.util.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author lihaocheng
 * @create 2019-04-04 23:47
 **/

public class FileInputDemo2 {
    public static void main(String[] args) {
        try {
            FileInputStream f=new FileInputStream("src/com/util/io/fuck.txt");
            byte[] b=new byte[100];
            f.read(b,0,1);
            System.out.println(new String(b));

            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
