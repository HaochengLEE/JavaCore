package com.jdk8plus.fork;

import java.util.concurrent.RecursiveTask;

/**
 * * @author lihaocheng
 * * @createtime 2021/8/25
 */
public class ForkJoinSumCalculator extends RecursiveTask<Long> {
    private final long[] numbers;
    private final int start;
    private final int end;

    public static final long THRESHOLD=10_000;

    public ForkJoinSumCalculator(long[] numbers) {
        this(numbers,0,numbers.length);
    }
    private ForkJoinSumCalculator(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length=end-start;
        if (length<=THRESHOLD){
            return computSequentially();
        }
        ForkJoinSumCalculator leftTask=new ForkJoinSumCalculator(numbers,start,start+length/2);
        leftTask.fork();
        ForkJoinSumCalculator rightTask=new ForkJoinSumCalculator(numbers,start+length/2,end);
        Long rightresult=rightTask.compute();
        Long leftresult=leftTask.join();
        return leftresult+rightresult;
    }

    private long computSequentially(){
        long sum=0;
        for (int i=start;i<end;i++){
            sum+=numbers[i];
        }
        return sum;
    }
}
