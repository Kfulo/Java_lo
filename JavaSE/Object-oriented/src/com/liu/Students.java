package com.liu;


//2026.7.24


public class Students extends Person {

    public static int age;      //静态
    public double score;        //非静态

    //匿名代码块
    {
        System.out.println("匿名代码块");
    }

    //静态代码块   只执行一次
    static {
        System.out.println("静态代码块");
    }

    //无参构造
    public Students(){
        System.out.println("Studens 无参构造执行！");

    }




    @Override
    public void run() {
        noRun();
        System.out.println("子类重写父类的run方法!");
    }

    public static void noRun(){
        System.out.println("norun");
    }


    public void eat(){
        System.out.println("eat方法！");
    }


    public void go(){
        System.out.println("GOGOGO!");
    }










}












