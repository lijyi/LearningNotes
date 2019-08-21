package com.lijyi.learn.imitation;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 模拟手写Java源码
 * @author liyang
 * @date 2019-08-20
 */
public class LinkedBlockingQueue<E> {

    private final int capacity;

    private AtomicInteger count = new AtomicInteger();

    public LinkedBlockingQueue(){
        this(Integer.MAX_VALUE);
    }

    public LinkedBlockingQueue(int capacity){
        this.capacity = capacity;
        head = last = new Node<>(null);
    }

    private ReentrantLock putLock = new ReentrantLock();

    private Condition notFull = putLock.newCondition();

    private ReentrantLock takeLock = new ReentrantLock();

    private Condition notEmpty = takeLock.newCondition();

    public void put(E e) throws InterruptedException {
        e = Objects.requireNonNull(e);
        putLock.lock();
        int c;
        try {
            while (count.get() == capacity){
                notFull.await();
            }
            insert(e);
            c = count.getAndIncrement();
            if(c + 1 < capacity){
                notFull.signal();
            }
        }finally {
            putLock.unlock();
        }
        if(c == 0) {
            signalNotEmpty();
        }
    }

    public E take() throws InterruptedException {
        E e;
        takeLock.lock();
        int c;
        try {
            while (count.get() == 0){
                notEmpty.await();
            }
            e = getNode();
            c = count.getAndDecrement();
            if(c > 1){
                notEmpty.signal();
            }
        }finally {
            takeLock.unlock();
        }
        if(c == capacity){
            signalNotFull();
        }
        return e;
    }

    private void signalNotFull() {
        putLock.lock();
        try {
            notFull.signal();
        }finally {
            putLock.unlock();
        }
    }


    private void signalNotEmpty() {
        takeLock.lock();
        try {
            notEmpty.signal();
        }finally {
            takeLock.unlock();
        }
    }

    static class Node<E> {
        E item;

        Node<E> next;

        Node (E e) {
            item = e;
        }
    }

    private Node<E> head;

    private Node<E> last;

    private void insert(E e) {
        last = last.next = new Node<>(e);
    }

    private E getNode(){
        Node<E> first = head.next;
        E e = first.item;
        head = first;
        head.item = null;
        return e;
    }


}
