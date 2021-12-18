package com.thread.future;

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
    void testFuture(){
        Future<Integer> future=threadPoolExecutor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                //休眠1000毫秒
                Thread.sleep(600);
                System.out.println("休眠结束");
                return 1;
            }
        });
        System.out.println("其他任务一样可以执行");
        //一分钟没有回应的话退出
        try {
            //通过get获取异步执行的结果
            Integer result=future.get(1000,TimeUnit.MILLISECONDS);
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
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
//            threadPoolExecutor.submit(()-> System.out.println(a.complete(sum)));
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

    @DisplayName("同步加名字")
    @Test
    void testList(){
        getNameList1().stream().forEach(
                s-> System.out.println(s)
        );
    }

    private List<String> getNameList(){
        List<String> nameList= Arrays.asList("1","2","3","4","8");
        List<CompletableFuture<String>> list=nameList.stream()
                .map(n->CompletableFuture.supplyAsync(
                        ()-> {
                            return addName(n);
                        }
                )).collect(Collectors.toList());

        return list.stream().map(CompletableFuture::join).collect(Collectors.toList());
    }

    private List<String> getNameList1(){
        List<String> nameList= Arrays.asList("1","2","3","4","8");
        return nameList.stream().map(s->addName(s)).collect(Collectors.toList());
    }


    private String addName(String name){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name+" proccess";
    }
}
