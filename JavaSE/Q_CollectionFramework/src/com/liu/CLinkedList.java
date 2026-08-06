package com.liu;

//2026.8.6
//链表（Linked list）



import java.util.LinkedList;    //引入 LinkedList 类

public class CLinkedList {
   public static void main(String[] args) {

       LinkedList<String> sites = new LinkedList<String>();
       sites.add("Google");
       sites.add("Runoob");
       sites.add("Taobao");
       sites.add("Weibo");
       System.out.println(sites);

       //更多的情况下我们使用 ArrayList 访问列表中的随机元素更加高效，
       // 但以下几种情况 LinkedList 提供了更高效的方法。

       //在列表开头添加元素
       System.out.println("在列表开头添加元素：===============");
       sites.addFirst("Wiki");
       System.out.println(sites);

       //在列表结尾添加元素
       System.out.println("在列表结尾添加元素：===============");
       sites.addLast("Wiki");
       System.out.println(sites);

       //在列表开头移除元素
       System.out.println("在列表开头移除元素：===============");
       sites.removeFirst();
       System.out.println(sites);

       //在列表结尾移除元素
       System.out.println("在列表结尾移除元素：===============");
       sites.removeLast();
       System.out.println(sites);

       //获取列表开头的元素
       System.out.println("获取列表开头的元素：===============");
       System.out.println(sites.getFirst());

       //获取列表结尾的元素
       System.out.println("获取列表结尾的元素：===============");
       System.out.println(sites.getLast());

       //迭代元素
       System.out.println("迭代元素：===============");
       for (String b : sites){
           System.out.println(b);
       }

       //计算大小
       System.out.println("sites的大小为："+sites.size());




    }
}
