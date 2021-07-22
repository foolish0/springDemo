package com.example.demo.test;

public class ThreadTest implements Runnable{
    private int count  = 5;
    @Override
    synchronized public void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + count + "!");
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        Thread a = new Thread(threadTest, "A");
        Thread b = new Thread(threadTest, "B");
        Thread c = new Thread(threadTest, "C");
        Thread d = new Thread(threadTest, "D");
        Thread e = new Thread(threadTest, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}


