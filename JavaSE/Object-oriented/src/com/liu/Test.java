package com.liu;


//静态导入包
import java.applet.Applet;

import static java.lang.Math.random;
import static java.lang.Math.PI;


public class Test {
    public static void main(String[] args) {

        System.out.println(random());
        System.out.println(PI);


        //没有名字初始化类，不用将实例保存在变量中
        new Apple().eat();

        UserS userS = new UserS() {
            @Override
            public void hello() {

            }

        };



    }
}




class Apple{

    public void eat(){
        System.out.println("eat!");
    }

}



interface UserS{

    void hello();
}

















