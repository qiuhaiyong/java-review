package com.qhy.review.variable;

public class StringToBasic {
    public static void main(String[] args) {
        //String->对应的基本数据类型
        String s5 = "123";
        //会在 OOP 讲对象和方法的时候回详细
        //解读 使用 基本数据类型对应的包装类的相应方法，得到基本数据类型
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        byte num5 = Byte.parseByte(s5);
        boolean b = Boolean.parseBoolean("true");
        short num6 = Short.parseShort(s5);

        System.out.println("===================");
        System.out.println(num1);//123
        System.out.println(num2);//123.0
        System.out.println(num3);//123.0
        System.out.println(num4);//123
        System.out.println(num5);//123
        System.out.println(num6);//123
        System.out.println(b);//true
        //怎么把字符串转成字符char -> 含义是指 把字符串的第一个字符得到
        //解读  s5.charAt(0) 得到 s5字符串的第一个字符 '1'
        System.out.println(s5.charAt(0));


        String s2 = "hello";
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
        System.out.println(Integer.parseInt(s2));
    }
}
