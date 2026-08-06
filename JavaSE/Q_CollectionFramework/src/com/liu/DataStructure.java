package com.liu;

//2026.8.6


import java.util.*;

public class DataStructure {
    public static void main(String[] args) {


    //数组（Arrays）
        int[] array = new int[5];

    //列表（Lists）
        List<String> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

    //集合（Sets）
        Set<String> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

    //映射（Maps）
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();


    //栈（Stack）
        Stack<Integer> stack = new Stack<>();


    //队列（Queue）
    // 队列（Queue）遵循先进先出（FIFO）原则，
    // 常见的实现有 LinkedList 和 PriorityQueue。
        Queue<String> queue = new LinkedList<>();

    //堆（Heap）
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    //树（Trees）
        class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }












    }
}
