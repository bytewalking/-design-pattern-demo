package com.evan.design.pattern.adapter;

import java.util.concurrent.Callable;

public class Task implements Callable<Long>{
    private long num;
    public Task(long num) {
        this.num = num;
    }

    public Long call() throws Exception {
        long r = 0;
        for (long n = 1; n <= this.num; n++) {
            r = r + n;
        }
        System.out.println("Result: " + r);
        return r;
    }

    public static void main(String[] args) {
        Callable<Long> callable =  new Task(123450000L);
        //Thread thread = new Thread(callable); // compile error!
        Thread thread = new Thread(new RunnableAdapter(callable));
        thread.start();
    }
}
