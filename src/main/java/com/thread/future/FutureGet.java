package com.thread.future;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

/**
 * @author lihaocheng
 * @createtime 2021/12/19
 */
public class FutureGet {
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
        //定义一个返回值为Integer的Future
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
            //通过get获取Future异步执行的结果
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

}
