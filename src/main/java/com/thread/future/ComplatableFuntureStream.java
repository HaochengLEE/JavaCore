package com.thread.future;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * @author lhc
 * @created 2021/12/18下午6:13
 */
public class ComplatableFuntureStream {
    private static ThreadPoolExecutor threadPoolExecutor;

    @BeforeAll
    static void init(){
        threadPoolExecutor=new ThreadPoolExecutor(5,10,100, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>());
        System.out.println("创建线程池");
    }

    @AfterAll
    static void close(){
        threadPoolExecutor.shutdown();
        System.out.println("关闭线程池");
    }

    @Test
    void testCompletable(){
        Integer sum=0;
        CompletableFuture<Integer> a=CompletableFuture.supplyAsync(()->{
            addName("name");
            return 2;
        });
        CompletableFuture<Integer> b=new CompletableFuture<>();
        for (int i=0;i<999999;i++){
            threadPoolExecutor.submit(()-> System.out.println(b.complete(sum)));
        }
    }

    @DisplayName("异步加名字")
    @Test
    void testAsyList(){
        getNameList().stream().forEach(
                s-> System.out.println(s)
        );
    }

    @DisplayName("Stream实现异步加名字")
    @Test
    void testAsyStreamList(){
        getNameList().stream().parallel().forEach(
                s-> System.out.println(s)
        );
    }
    @DisplayName("同步加名字")
    @Test
    void testList(){
        getNameList1().stream().forEach(
                s-> System.out.println(s)
        );
    }

    /**
     * 使用CompletableFuture在字符后面追加字符
     * @return
     */
    private List<String> getNameList(){
        List<String> nameList= Arrays.asList("1","2","3","4","8");
        List<CompletableFuture<String>> list=nameList.stream()
                .map(n->CompletableFuture.supplyAsync(
                        ()-> {
                            return addName(n);
                        }
                )).collect(Collectors.toList());
        //使用CompletableFuture::join获取回掉
        return list.stream().map(CompletableFuture::join).collect(Collectors.toList());
    }

    /**
     * 使用单线程增加字符
     * @return
     */
    private List<String> getNameList1(){
        List<String> nameList= Arrays.asList("1","2","3","4","8");
        return nameList.stream().map(s->addName(s)).collect(Collectors.toList());
    }


    /**
     * 追加字符，用sleep模拟1秒的处理时间
     * @param name
     * @return
     */
    private String addName(String name){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name+" proccess";
    }
}
