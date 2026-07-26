package com.liu;


//2024.7.15


import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {


        //顺序结构

        //选择结果 if，switch
        System.out.println("用例：评价成绩----------");
        System.out.println("请输入成绩等级：（A,B,C,D)");
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);      //charAt()获取输入字符串的第一个字符

        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格！！！");
        }


        //循环结构 while,do while
        System.out.println("案例1：输出1-100:-------");
        int i = 0;
        while (i<100){
            i++;
            System.out.println("第"+i+"个数字是："+i);
        }

        System.out.println("案例2：计算1+2+3+.....+100---------");
        int k = 0;
        int sum = 0;
        while(k<100){
            k++;
            sum +=k;
        }
        System.out.println("1-100的和是："+sum);

        System.out.println("用do while 执行输出1-100---------");
        int q = 0;
        do {
            q++;
            System.out.println(q);
        }while (q<100);

        //循环结构 for
        System.out.println("------for循环---------");
        int sums = 0;
        for (int n = 1;n <= 100;n++){
            sums += n;
        }
        System.out.println("1-100的和是："+sums);















































    }
}
