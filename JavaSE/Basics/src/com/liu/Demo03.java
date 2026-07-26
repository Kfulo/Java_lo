package com.liu;

//2026.7.14
/*
    运算符
        算术
        赋值
        关系
        逻辑  &&  || ！
        位运算
        条件运算  ？ ；
        扩展赋值运算符
 */


public class Demo03 {

    //修饰符不区分先后顺序
    //常量 final
    static final double PI = 3.14;


    public static void main(String[] args) {

        System.out.println(PI);
        System.out.println("-----------");

        //二元运算符
        // ctrl+d 复制当前行到下一行
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double)b);

        //关系运算符 输出布尔值
        System.out.println("------------");
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //数学函数
        System.out.println("************");
        double pow = Math.pow(2,3);    //a的b次方
        System.out.println(pow);

        //位运算
        System.out.println("++++++++++++");
        System.out.println(2<<3);       //左移
        System.out.println(16>>3);      //右移

        //字符串连接符  +
        System.out.println(" "+a+b);
        System.out.println(a+b+" ");

        //条件运算符
        // x ？ y ：z     如果x==true，则为y，否则为z
        int score = 98;
        String end = score < 60 ?"不及格":"及格";
        System.out.println(end);





























    }

}
