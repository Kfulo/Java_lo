package com.liu;

// 2026.07.14

public class Demo01 {
    public static void main(String[] args) {


/*
    注释
        单行注释
        多行注释
        文档注释
 */
/*  标识符
        字母，$，下划线 开始
 */
        String name = "liu";
        System.out.println(name);

/*  数据类型

 */
        int num = 10;
        System.out.println(num);
/*
        转义字符
            \t 制表符
            \n 换行
 */
        //布尔值扩展
        boolean flag = true;
        if (flag = true){
            System.out.println("yes!");
        }
        if (flag){
            System.out.println("yes!");
        }

/*  类型转换
        强制类型转换；  不能对布尔值转换   高容量至低容量
        自动类型转换；  低容量至高容量
 */
        int i = 12;
        byte b = (byte) i;        //强制类型转换
        System.out.println("----------");
        System.out.println(b);

        System.out.println((int)23.75);     //23
        System.out.println((int)-45.89f);   //-45
    // JKD 7 新特性 数字可以用下划线分割 方便计数
        int money = 1_0000_0000;
        System.out.println("money="+money);

/*  变量
 */
        int a = 1, c =10;
        char x = 'X';
        double pi = 3.14;



        System.out.println("hello world");
    }

}
