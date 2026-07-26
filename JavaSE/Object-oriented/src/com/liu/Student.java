package com.liu;


//学生类
public class Student {

    //属性
    String name;
    int age;
    private char sex;       //x为女，y为男
    private int grade;


    //方法
    //get 获取这个数据
    public char getSex(){
        return this.sex;
    }

    //set 给数据设置值
    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120||age < 0){
            this.age = 3;
        }else {
            this.age = age;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }




    //非静态方法
    public void say(){
        System.out.println("学生说话了！");
    }

    //静态方法
    public static void play(){
        System.out.println("学生打了！");
    }


    public void study(){
        System.out.println(this.name+"is studying!");
    }


}
