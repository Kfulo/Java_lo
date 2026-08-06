package com.liu;

//2026.8.6


public class StringClass {

    public static void main(String[] args) {

        //String 创建的字符串存储在公共池中，而 new 创建的字符串对象在堆上；
        String str = "Runoob";
        String str2=new String("Runoob");


        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        //String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了；
        //如果需要对字符串做很多修改，那么应该选择使用 StringBuffer & StringBuilder 类。

        System.out.println("===================================================");
        //连接字符串，不过更多用 + 连接；
        System.out.println(str.concat(str2));


        System.out.println("===================================================");
        //String 类使用静态方法 format() 返回一个String 对象而不是 PrintStream 对象。
        //String 类的静态方法 format() 能用来创建可复用的格式化字符串，而不仅仅是用于一次打印输出。
        String fs;
        fs = String.format(str+"+"+str2);
        System.out.println(fs);






















    }
}
