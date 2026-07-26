package com.liu;


//2026.7.15

/*
    方法重载： 方法名称必须相同；参数列表必须不同（个数，类型，排列顺序三者任意一个不同即可）；
              返回类型可同可不同；
 */


import java.util.Scanner;

public class Demo01 {

    //方法：两数求和（整数）
    public static int add(int a,int b){
        return a+b;     //返回值

    }


    //方法重载：两数求和（浮点数）
    public static double add(double a,double b){
        return a+b;     //返回值

    }


    //方法；输出1-1000内能被5整除的数
    public static void test(){
        //输出1-1000内能被5整除的数，且每行输出三个
        System.out.println("输出1-1000内能被5整除的数，每行输出三个");
        for(int x = 1;x<=1000;x++){
            if (x%5 == 0){
                System.out.print(x+"\t");
            }
            if(x%(5*3)==0){
                System.out.print("\n");
            }
        }
        System.out.println();
    }


    //方法：输入两个数，比大小，返回大的
    public static int maxOfTwo(){
        int result = -1;
        System.out.println("请输入两个数字：");

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2){
            System.out.println("两个数相等。");
            return 0;
        }

        if (num1 > num2){
            result = num1;
        }else {
            result = num2;
        }

        System.out.println("较大的数字是："+result);
        return 0;
    }


    //main
    public static void main(String[] args) {

        int sum = add(1,2);     //调用方法add()
        System.out.println("两整数的和是："+sum);

        test();     //调用方法test() 输出1-1000内能被5整除的数

        maxOfTwo();      //调用方法maxOfTwo()

        double sumDouble = add(1.5,2.5);    //调用重载方法add()
        System.out.println("两浮点数的和是："+sumDouble);









    }



































}
