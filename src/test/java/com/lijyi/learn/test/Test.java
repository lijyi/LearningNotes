package com.lijyi.learn.test;

import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyang
 * @date 2019-08-13
 */
public class Test implements Runnable {

    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread t = new Thread(() ->{

        });
        Thread t2 = new Thread(){

        };
        Executors.newCachedThreadPool();
    }

    @Override
    public void run() {

    }
}
