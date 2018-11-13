package com.example.lib;

public class ThreadExampleFromThread extends Thread {
    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName());
    }

}


