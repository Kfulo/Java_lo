package com.liu;

//2026.8.6

/*
HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
HashSet 允许有 null 值。
HashSet 是无序的，即不会记录插入的顺序。
HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。
HashSet 实现了 Set 接口。

HashSet 中的元素实际上是对象，一些常见的基本类型可以使用它的包装类。
 */

import java.util.HashSet; // 引入 HashSet 类

public class CHashSet {
    public static void main(String[] args) {

        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");    // 重复的元素不会被添加
        System.out.println(sites);

        //判断元素是否存在
        System.out.println("判断元素是否存在：===============");
        System.out.println(sites.contains("Taobao"));
        System.out.println(sites.contains("Ta"));

        //删除元素
        System.out.println("删除元素：===============");
        sites.remove("Taobao");  // 删除元素，删除成功返回 true，否则为 false
        System.out.println(sites);
        System.out.println("全部删除元素：===============");
        sites.clear();              //！！！删除全部元素
        System.out.println(sites);

        //计算大小
        System.out.println("计算大小：===============");
        System.out.println(sites.size());

        //迭代
        System.out.println("迭代元素：===============");
        for (String x : sites){
            System.out.println(x);
        }




    }
}
