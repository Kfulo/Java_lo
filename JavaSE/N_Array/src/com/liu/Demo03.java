package com.liu;


//2026.7.15
//排序算法举例：冒泡排序

import java.util.Arrays;

public class Demo03 {


    //方法 冒泡排序（从大到小） （已优化）
    public static int[] bubbleSort(int[] array){

        int temp = 0;       //用以交换

        //外循环，轮数
        for (int i = 0;i < array.length-1;i++){

            boolean flag = false;   //标志位

            //内循环，每轮比较的次数
            for (int j = 0;j < array.length-1-i;j++){
               if (array[j+1] > array[j]){
                   temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
                   flag = true;
               }
            }

            if (flag == false){     //若数组已有序，退出循环
                break;
            }


        }

        return array;
    }


    //方法 冒泡排序（从小到大）
    public static int[] bubbleSort2(int[] array){

        int temp = 0;
        for (int i = 0;i < array.length-1;i++){
            for (int j = 0;j < array.length-1-i;j++){
                if (array[j+1] < array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }




    //main
    public static void main(String[] args) {


        int a[] ={5,22,69,2,14,36,22,99,169};
        int b[] ={5,22,69,2,14,36,22,99,169};


        bubbleSort(a);      //调用方法 冒泡排序 大-小
        System.out.println("冒泡排序(从大到小）后的数组:"+ Arrays.toString(a));


        bubbleSort2(b);     //调用方法 冒泡排序 小-大
        System.out.println("冒泡排序(从小到大）后的数组:"+ Arrays.toString(b));



    }





}
