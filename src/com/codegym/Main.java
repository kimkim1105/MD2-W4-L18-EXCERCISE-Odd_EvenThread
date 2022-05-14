package com.codegym;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread thread1 = new Thread(evenThread);
        Thread thread2 = new Thread(oddThread);
        thread1.start();
        try {
            thread1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        thread2.start();
    }
}
