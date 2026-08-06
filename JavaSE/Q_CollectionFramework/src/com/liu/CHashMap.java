package com.liu;

//2026.8.6
/*
HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，
最多允许一条记录的键为 null，不支持线程同步。

HashMap 是无序的，即不会记录插入的顺序。
HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。

HashMap 的 key 与 value 类型可以相同也可以不同，
可以是字符串（String）类型的 key 和 value，
也可以是整型（Integer）的 key 和字符串（String）类型的 value。

HashMap 中的元素实际上是对象，一些常见的基本类型可以使用它的包装类。
 */


import java.util.HashMap; // 引入 HashMap 类

public class CHashMap {
    public static void main(String[] args) {

        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);

        System.out.println("===============");
        // 创建 HashMap 对象 Sites2
        HashMap<String, String> Sites2 = new HashMap<String, String>();
        // 添加键值对
        Sites2.put("one", "Google");
        Sites2.put("two", "Runoob");
        Sites2.put("three", "Taobao");
        Sites2.put("four", "Zhihu");
        System.out.println(Sites2);


        //访问元素:根据键值
        System.out.println("访问元素：===============");
        System.out.println(Sites.get(3));
        System.out.println(Sites2.get("two"));

        //删除元素:根据键值
        System.out.println("删除元素：===============");
        Sites.remove(4);
        System.out.println(Sites);

        //删除所有键值对(key-value)可以使用 clear 方法
        System.out.println("删除全部：===============");
        Sites.clear();
        System.out.println(Sites);

        //计算大小
        System.out.println("计算大小：===============");
        System.out.println(Sites2.size());

        //迭代
        //如果你只想获取 key，可以使用 keySet() 方法，然后可以通过 get(key) 获取对应的 value。
        //如果你只想获取 value，可以使用 values() 方法。
        System.out.println("迭代：===============");
        // 输出 key 和 value
        for (String i : Sites2.keySet()) {
            System.out.println("key: " + i + " value: " + Sites2.get(i));
        }
        // 返回所有 value 值
        for(String value: Sites2.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }

















    }
}
