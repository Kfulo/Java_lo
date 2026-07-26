package com.liu;


//2026.7.15

/*
    可变参数
        在指定参数类型后加一个省略号（...）;
        必须放在最后面
        只能有一个

 */


public class Demo02 {

    //方法test() 输出传递的可变参数
    public void test(int...i){
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);
    }


    //方法printMax() 输出最大值
    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("null!");
            return;
        }

        double result = numbers[0];
        //求最大值
        for (int i = 1;i < numbers.length;i++){
            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("最大的数是："+result);

    }






    public static void main(String[] args) {

        Demo02 demo02 = new Demo02();
        demo02.test(11,22,33,44,55);

        printMax(34,3,5,9,159,1123);
        printMax(new double[]{1,2,3});




    }



















}
