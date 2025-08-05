package com.qhy.review.java8;

public class Lambda_01 {
    public static void main(String[] args) {
        // 原始
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("example01------------------");
            }
        }).start();

        // lambda
        new Thread(() -> {
            System.out.println("example02---------------");
        }).start();


    }
}
