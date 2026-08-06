package com.liu;

//2026.8.6

/*
ArrayList 类是一个可以动态修改的数组，
与普通数组的区别就是它是没有固定大小的限制，我们可以添加或删除元素。
ArrayList 继承了 AbstractList ，并实现了 List 接口。
 */

import java.util.ArrayList;      // 引入 ArrayList 类
import java.util.Collections;  // 引入 Collections 类

public class CArrayList {
    public static void main(String[] args) {


        ArrayList<String> sites = new ArrayList<String>();


        //添加元素
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);

        //访问元素
        System.out.println("===============");
        System.out.println(sites.get(0));  // 访问第一个元素
        System.out.println(sites.get(1));  // 访问第二个元素

        //修改元素
        System.out.println("修改后：===============");
        sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改
        System.out.println(sites);

        //删除元素
        System.out.println("删除后：===============");
        sites.remove(3); // 删除第四个元素
        System.out.println(sites);

        //计算大小
        System.out.println("计算大小：===============");
        System.out.println(sites.size());

        //迭代元素
        System.out.println("迭代元素：===============");
        for (String a : sites) {
            System.out.println(a);
        }

        //元素排序
        //Collections 类也是一个非常有用的类，位于 java.util 包中，提供的 sort() 方法可以对字符或数字列表进行排序。
        System.out.println("元素排序：===============");
        Collections.sort(sites);  // 字母排序
        for (String i : sites) {
            System.out.println(i);
        }



    //ArrayList 中的元素实际上是对象，在以上实例中，数组列表元素都是字符串 String 类型；
    //如果我们要存储其他类型，而 <E> 只能为引用数据类型，
    //这时我们就需要使用到基本类型的包装类。
        ArrayList<Integer> li = new ArrayList<>();     // 存放整数元素
        ArrayList<Character> liu = new ArrayList<>();   // 存放字符元素









    }
}
