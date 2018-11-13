package com.example.a401_01.myapplication;

public class threadExamplefromRunnable implements Runnable
{
    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName());
    }
}
