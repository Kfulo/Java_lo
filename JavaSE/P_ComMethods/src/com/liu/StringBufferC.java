package com.liu;

public class StringBufferC {

    public static void main(String[] args) {

        //StringBuilder 类在 Java 5 中被提出，
        //它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
        //由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");                  //添加
        System.out.println(sb);
        sb.insert(8, "Java");  //对应位置插入
        System.out.println(sb);
        sb.delete(5,8);                  //删除
        System.out.println(sb);


        System.out.println("====================");
        //然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);



















    }
}
