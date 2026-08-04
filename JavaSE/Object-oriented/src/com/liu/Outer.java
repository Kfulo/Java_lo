package com.liu;


//2026.8.4


public class Outer {

    private int id = 10;

    public void out(){
        System.out.println("外部类的方法 out（）");
    }

    public void method(){

        class Inner{
            public void in(){

            }
        }

    }






    //内部类
    public class Inner{

        public void in(){
            System.out.println("内部类的方法 in（）");

        }

        //获得外部类的私有属性
        public void getID(){
            System.out.println(id);
        }



    }





















}
