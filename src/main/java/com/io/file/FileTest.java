package com.io.file;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author lhc
 * @created 2022/1/6下午4:50
 */
public class FileTest {
    /**
     * readAllLines 方法
     * 一次性全部读出
     * @throws IOException
     */
    @Test
    void testReadAllLines() throws IOException {
        List<String> list= Files.readAllLines(Paths.get("/opt/programing/JavaCore/src/main/java/com/io/file/1.txt"));
        list.stream().forEach(s-> System.out.println(s));
    }

    /**
     * lines方法
     * 可以按需加载
     * @throws IOException
     */
    @Test
    void testLines() throws IOException {
        //这样的使用方式是有问题的，我们没有关闭流，最后可能导致 Too many open file 的问题
        Stream<String> stringStream=Files.lines(Paths.get("/opt/programing/JavaCore/src/main/java/com/io/file/1.txt"))
                .limit(1);
        stringStream.forEach(s-> System.out.println(s));
        //必须通过 try with catch 来使用
        try(Stream<String> stream=Files.lines(Paths.get("/opt/programing/JavaCore/src/main/java/com/io/file/1.txt"))){
            stream.forEach(i-> System.out.println(i));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    void testBuffer() {
        try (BufferedInputStream inputStream=new BufferedInputStream(new FileInputStream("/opt/programing/JavaCore/src/main/java/com/io/file/1.txt"))){
            BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream("/opt/programing/JavaCore/src/main/java/com/io/file/2.txt"));
            int i=0;
            while ((i=inputStream.read())!=-1){
                outputStream.write(i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
