package com.liu;


//2026.7.15


public class Demo03 {

    //方法f()  求某个数的阶乘  递归
    public static int f(int n){
        if(n == 1){
            return 1;
        }else{
            return n*f(n-1);
        }
    }










    public static void main(String[] args) {

        System.out.println(f(3));       //调用方法求阶乘










    }






























}
