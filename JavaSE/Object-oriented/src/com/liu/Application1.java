package com.liu;


//主测试 1

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.nio.file.StandardOpenOption;

public class Application1 {


    public static void main(String[] args) {

        //类，抽象的，实例化
        //类实例化后会返回一个自己的对象
        //student对象就是一个Student类的具体实例
        Student xiaoming = new Student();
        Student xiaohong = new Student();
        System.out.println("未赋值之前 默认初始化：");
        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        System.out.println("赋值：");
        xiaoming.name = "小明";
        xiaoming.age = 10;
        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);
        xiaohong.name = "小红";
        xiaohong.age = 12;
        System.out.println(xiaohong.name);
        System.out.println(xiaohong.age);



        //构造器
        System.out.println("------------------------------");
        Person per = new Person();       //调用无参构造
        System.out.println(per.name+" "+per.age+" "+per.rName);

        Person person = new Person("刘某",22);    //调用有参构造
        System.out.println(person.name);


        //Pet类
        System.out.println("------------------------------");
        Pet dog = new Pet();
        dog.name = "旺财";
        dog.age = 3;
        dog.shout();

        System.out.println(dog.name);
        System.out.println(dog.age);



        //封装
        System.out.println("------------------------------");
        Student.play();
        Student s1 = new Student();
        s1.say();

        s1.setName("刘某 ");
        s1.study();
        s1.setSex('y');
        s1.setGrade(99);
        s1.setAge(22);     //不合法年龄
        System.out.println(s1.getGrade());
        System.out.println(s1.getSex());
        System.out.println(s1.getAge());



        //继承
        System.out.println("------------------------------");
        Teacher teacher = new Teacher();
        teacher.say();

        teacher.setMoney(100);      //索要100
        System.out.println(teacher.getMoney());
        teacher.moneySum();

        teacher.setMoney(200);      //又索要200
        System.out.println(teacher.getMoney());
        teacher.moneySum();

        teacher.test("刘松超");
        teacher.test1();




        //重写
        //需要有继承关系，子类重写父类的方法；
        //方法名和参数列表必须相同；
        //修饰词：范围可以扩大但不能缩小（public>protected>default>private)
        //方法重写，与属性无关；
        //只跟非静态方法有关；
        System.out.println("------------------------------");
        A a = new A();
        a.test();           //A-test

        //父类的引用指向了子类
        B b = new A();      //A-test
        b.test();



        //多态
        //一个对象的实际类型是确定的，但可以指向的引用类型不确定了。
        System.out.println("------------------------------");
        Students ss1 = new Students();
        //Person 父类型； 可以指向子类，但不能调用子类独有的方法；
        Person ss2 = new Students();        //父类的引用指向子类
        Object ss3 = new Students();
        System.out.println("-----");
        //对象能执行哪些方法，主要看对象左边的类型，和右边无关。
        ss2.run();
        ss1.run();
        ss1.eat();



        //instanceof
        //Object > Person > Student
        //Object > Person > Teacher
        //父子关系为true，兄弟关系为false，无关 报错。
        System.out.println("------------------------------");
        Object object = new Students();
        System.out.println(object instanceof Students);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);
        System.out.println(object instanceof Teacher);
        System.out.println(object instanceof String);

        System.out.println("------");
        Person pp = new Students();
        System.out.println(pp instanceof Students);
        System.out.println(pp instanceof Person);
        System.out.println(pp instanceof Object);
        System.out.println(pp instanceof Teacher);
        //System.out.println(pp instanceof String);     //报错

        System.out.println("------");
        Students ss = new Students();
        System.out.println(ss instanceof Students);
        System.out.println(ss instanceof Person);
        System.out.println(ss instanceof Object);
        //System.out.println(ss instanceof Teacher);    //报错
        //System.out.println(ss instanceof String);     //报错



        //类型转换
        System.out.println("------------------------------");
        //高              低
        Person ppp = new Students();
        //将ppp这个对象转换成Students类型，就可以使用Students类型的方法了。
        ((Students) ppp).go();               //高转低 强制转换
        Students ppp_s = (Students) ppp;     //高转低 强制转换
        ppp_s.go();

        System.out.println("------");
        Students students = new Students();
        students.go();
        Person pe = students;               //低转高 自然转换






    }
}
