package com.liu;


//2026.7.15
//稀疏数组
//实例：压缩存储，再还原


public class Demo04 {

    public static void main(String[] args) {

        System.out.println("-------------------");
        System.out.println("稀疏数组压缩存储实例：11*11的棋盘保存棋子分布\n1表示黑棋，2表示白棋，0表示空\n");

        int[][] a = new int[11][11];    //数组赋值
        a[1][2] = 1;            //黑棋位置：2*3 3*4
        a[2][3] = 1;            //白棋位置：1*1 7*9 10*9
        a[0][0] = 2;
        a[6][8] = 2;
        a[9][8] = 2;

        for(int[] ints : a){            //双增强for循环  打印棋盘

            for (int anInt : ints){
                System.out.print(anInt+"\t");
            }

            System.out.print("\n");


        }

        int sum = 0;               //统计有效字符（棋子）的个数
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (a[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("棋子数量为："+sum);



        //------------------------------------------------------------------------
        //将三元组，存在稀疏数组中
        int[][] b = new int[sum+1][3];

        b[0][0] = 11;       //行
        b[0][1] = 11;       //列
        b[0][2] = sum;      //非零元素个数

        int count = 0;
        for (int i = 0; i < a.length; i++) {                //构建稀疏数组
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0){
                    count++;
                    b[count][0] = i;
                    b[count][1] = j;
                    b[count][2] = a[i][j];

                }

            }

        }

        //输出稀疏数组
        System.out.println("稀疏数组：");
        for(int[] ints : b){

            for (int anInt : ints){
                System.out.print(anInt+"\t");
            }

            System.out.print("\n");

        }



        //------------------------------------------------------------------------
        //稀疏数组还原成原数组
        System.out.println("还原稀疏数组");

        int [][] c = new int[b[0][0]] [b[0][1] ];        //创建还原数组

        for (int i = 1; i < b.length;i++){      //还原值
            c[b[i][0]] [b[i][1]] = b[i][2];
        }

        //输出还原数组
        System.out.println("还原数组：");
        for(int[] ints : c) {

            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }

            System.out.print("\n");
        }











    }















}
