package com.qhy.review.java8;

import java.util.function.IntBinaryOperator;

public class Lambda_02 {

    public static void main(String[] args) {
        System.out.println(caculateNumber(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        }));
    }


    public static int caculateNumber(IntBinaryOperator operator){
        int a = 1;
        int b = 2;
        return operator.applyAsInt(a,b);
    }



}

