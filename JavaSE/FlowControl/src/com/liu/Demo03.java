package com.liu;


//2026.7.15


public class Demo03 {
    public static void main(String[] args) {

        //求100内奇数和偶数的和
        System.out.println("输出100以内的奇数和偶数，以及奇数的和 偶数的和");
        int oddSum = 0;
        int evenSum = 0;
        for(int i =0;i<=100;i++){
            if (i%2==0){
                System.out.println("这是偶数："+i);
                evenSum+=i;
            }else {
                System.out.println("这是奇数："+i);
                oddSum+=i;
            }
        }
        System.out.println("偶数的和是："+evenSum);
        System.out.println("奇数的和是："+oddSum);

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

        //输出99乘法表
        System.out.println("\n九九乘法表：");
        for (int m = 1;m<10;m++){
            for (int n =1;n<=m;n++){
                System.out.print(m+"*"+n+"="+m*n+"\t");
            }
            System.out.print("\n");
        }

        //增强for循环
        System.out.println("增强for循环");
        int[] numbers = {10,20,30,40,50};   //定义数组
        //遍历数组的元素
        for (int x:numbers){
            System.out.println(x);
        }




    }


}
