package com.qhy.review.java8;

import java.util.function.Function;

public class  Lambda_03{
    public static void main(String[] args) {
        System.out.println(typeConver((Function<String, Integer>) s -> Integer.valueOf(s)));
    }
    public static <R> R typeConver(Function<String,R> function){
        String str = "1235";
        R result = function.apply(str);
        return result;
    }
}
