package com.liu;


//2026.7.15


public class Demo01 {


    //方法   打印数组元素
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    //方法  反转数组
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];

        //反转操作
        for (int i = 0,j= result.length-1; i < array.length; i++,j--) {

            result[j] = array[i];
        }
        return result;
    }


    //方法重载  打印二维数组元素
    public static void printArray(int[][] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("ars["+i+"]["+j+"]="+array[i][j]);
            }
        }

    }



    //main
    public static void main(String[] args) {



        int[] nums = new int[10];       //声明并创建数组

        for (int i = 0; i < nums.length; i++) {      //数组元素赋值
            nums[i] = i+1;
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {       //数组元素求和
            sum += nums[i];
        }
        System.out.println("数组元素的和是："+sum);

        //增强for 遍历数组
        System.out.println("增强for循环遍历数组元素：");
        for (int x : nums){
            System.out.println(x);
        }


        System.out.println("------------------");
        printArray(nums);       //调用方法打印数组


        System.out.println("反转数组：");
        int[] reverseNums = reverse(nums);      //调用方法 反转数组
        printArray(reverseNums);        //调用方法  打印反转数组




        System.out.println("二维数组：");
        int[][] plane = new int[2][3];
        int[][] ars = {{1,2},{2,5},{3,5},{9,4}};

        System.out.println(ars[2][1]);

        System.out.println("--------------");
        System.out.println("遍历二维数组：");
        printArray(ars);        //调用方法 打印二维数组






    }

























}
