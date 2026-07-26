package com.liu;


//2026.7.15


import java.util.Scanner;

public class Demo01 {


    public static void main(String[] args) {

        //创建一个扫描器对象，接收键盘数据
        Scanner s = new Scanner(System.in);
        System.out.println("使用next方式接收：");
        //判断用户有没有输入字符串
        if (s.hasNext()){
            String str = s.next();
            System.out.println("输出的内容为："+str);
        }

        //next()不能得到带有空格的字符串；
        //nextLine()可以获得空白；
        Scanner x = new Scanner(System.in);
        System.out.println("使用nextLine方式接收：");
        if (x.hasNextLine()){
            String str2 = x.nextLine();
            System.out.println("输出的内容为："+str2);
        }
        //x.close();      //关闭io流


        System.out.println("--------------------------");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("整数数据："+i);
        }else {
            System.out.println("非整数！");
        }

        System.out.println("实例---------------------");
        System.out.println("输入多个数字，求总和与平均数，通过输入非数字结束输入并输出结果");
        Scanner num = new Scanner(System.in);
        double sum = 0;     //和
        int m = 0;      //计算输入数字个数
        while (num.hasNextDouble()){
            double y = num.nextDouble();
            m++;
            sum += y;
        }
        System.out.println(m+"个数的和是："+sum);
        System.out.println(m+"个数的平均值是："+(sum/m));

        num.close();














    }












}






