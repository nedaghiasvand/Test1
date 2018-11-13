package com.example.a401_01.myapplication;

public class threadExample3 {

    public static void main(String[] args) {
    threadExamplefromRunnable threadExample = new threadExamplefromRunnable();
    Thread thread = new Thread(threadExample);
    thread.start();
    thread.start();





    }
}
