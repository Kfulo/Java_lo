package com.liu;


//2026.7.15
//Arrays类


import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo02 {


    public static void main(String[] args) {

        System.out.println("Arrays类");

        //打印数组元素  Arrays.toString()
        int[] a = {11,35,6,89,1,55};
        System.out.println("输出数组："+ Arrays.toString(a));

        //排序 Array.sort()
        System.out.println("将数组a排序后输出：");
        Arrays.sort(a);
        System.out.println("数组排序之后："+Arrays.toString(a));





    }
}
