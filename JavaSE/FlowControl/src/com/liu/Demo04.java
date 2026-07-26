package com.liu;


//2026.7.15


public class Demo04 {
    public static void main(String[] args) {

        //break的用法：强制退出循环
        //continue的用法：终止某次循环过程



        //打印三角形
        for (int i = 1; i <= 5; i++) {
            for (int j = 5;  j>i; j--) {
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
