package com.liu;

//2026.7.14
/*  变量命名规范
        见名知意
        类成员变量：首字母小写 驼峰原则
        局部变量：  首字母小写 驼峰原则
        常量：     大写字母和下划线
        类名：     首字母大写 驼峰原则
        方法名：    首字母小写 驼峰原则
 */


public class Demo02 {

    //实例变量：从属于对象；如果不初始化值，就是这个类型的默认值；
    //布尔值的默认值是false
    //除了基本类型，其他的默认值都是null；
    String name;
    int age;


    //类变量
    static double salary = 30000;


    //main 方法
    public static void main(String[] args) {

        int i = 10;     //局部变量，必须声明和初始化值
        System.out.println(i);


        // 变量类型  变量名字  =  new com.liu.Demo02;
        Demo02 demo02 = new Demo02();
        System.out.println("-------------");
        System.out.println(demo02.age);
        System.out.println(demo02.name);


        //类变量
        System.out.println(salary);
    }


    //其他方法
    public void add(){

    }


}
