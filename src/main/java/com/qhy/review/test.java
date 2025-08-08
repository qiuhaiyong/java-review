package com.qhy.review;

import com.qhy.review.java8.Author;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
        Author author = new Author();
        author.setAge(10);
        Integer age1 = author.getAge();
        author.setAge(20);
        System.out.println(age1);
        System.out.println(author.getAge());
    }


}



