package com.liu;

public class Person {

    String name;
    int age;

    private int money = 1_000;

    protected String rName = "liu";


    public void print(){
        System.out.println("print Person");
    }


    //无参构造
    public Person() {
        System.out.println("Person 无参构造执行");
    }



    //有参构造
    public Person(String name) {
        System.out.println("Person 有参构造执行");
        this.name = name;
    }

    public Person(String name, int age) {
        System.out.println("Person 有参构造执行");
        this.name = name;
        this.age = age;
    }




    public void say(){
        System.out.println("说话了");
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = this.money-money;
    }


    public void moneySum(){
        System.out.println("剩余的钱是："+this.money);
    }



    //
    public void run(){
        System.out.println("run方法执行！");
    }




}
