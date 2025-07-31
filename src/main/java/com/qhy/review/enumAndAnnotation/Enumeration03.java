package com.qhy.review.enumAndAnnotation;

public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SPRING.getName());
        System.out.println(Season2.SPRING.name());
        System.out.println(Season2.SPRING.name());
    }
}

enum Season2{
    SPRING("春天","温暖");

    private String name;

    private String desc;

    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

