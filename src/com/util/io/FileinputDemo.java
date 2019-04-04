package com.util.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author lihaocheng
 * @create 2019-04-04 23:07
 **/

public class FileinputDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("src/com/util/io/fuck.txt");
            int m=0;
            while ((m=fileInputStream.read())!=-1){
                System.out.println((char)m);

            }
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
