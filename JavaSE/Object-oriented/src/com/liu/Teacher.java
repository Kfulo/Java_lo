package com.liu;

public class Teacher extends Person{



    private String rName = "liusongchao";


    public void print(){
        System.out.println("print Teacher");
    }


    public Teacher() {
        super();            //隐藏代码：调用父类的无参构造
        System.out.println("Teacher 无参构造执行");
    }



    public void test(String name){
        System.out.println(name);
        System.out.println(this.rName);
        System.out.println(super.rName);
        System.out.println("---------");
    }


    public void test1(){
        print();
        this.print();
        super.print();
        System.out.println("----------");

    }



}
