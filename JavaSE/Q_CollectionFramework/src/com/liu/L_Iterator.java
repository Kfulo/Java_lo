package com.liu;
//2026.8.6

//Iterator 是 Java 迭代器最简单的实现，ListIterator 是 Collection API 中的接口， 它扩展了 Iterator 接口。
/*
注意：Java 迭代器是一种单向遍历机制，即只能从前往后遍历集合中的元素，不能往回遍历。
同时，在使用迭代器遍历集合时，不能直接修改集合中的元素，而是需要使用迭代器的 remove() 方法来删除当前元素。
 */


import java.util.ArrayList;
import java.util.Iterator; // 引入 Iterator 类

public class L_Iterator {
    public static void main(String[] args) {

        // 创建集合
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // 获取迭代器
        Iterator<String> it = sites.iterator();

        System.out.println("===============");
        // next() 返回迭代器的下一个元素，并将迭代器的指针移到下一个位置。
        System.out.println(it.next());

        System.out.println("===============");
        //hasNext() 用于判断集合中是否还有下一个元素可以访问。
        //循环集合元素
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("===============");
        System.out.println("===============");

        //remove() 从集合中删除迭代器最后访问的元素（可选操作）。
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> iti = numbers.iterator();
        while(iti.hasNext()) {
            Integer i = iti.next();
            if(i < 10) {
                iti.remove();  // 删除小于 10 的元素
            }
        }
        System.out.println(numbers);








    }

}
