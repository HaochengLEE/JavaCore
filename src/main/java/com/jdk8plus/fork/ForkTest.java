package com.jdk8plus.fork;



import org.junit.jupiter.api.Test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 * * @author lihaocheng
 * * @createtime 2021/8/25
 */
public class ForkTest {
    @Test
    public void forkTest(){
        long k=forkJoinSum(10000000);
        System.out.println(k);
    }
    public static long forkJoinSum(long n){
        long[] numbers= LongStream.rangeClosed(1,n).toArray();
        ForkJoinTask<Long> task=new ForkJoinSumCalculator(numbers);
        return new ForkJoinPool().invoke(task);
    }
}
