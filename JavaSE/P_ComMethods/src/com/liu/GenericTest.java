package com.liu;

//2026.8.6

//类型通配符一般是使用 ? 代替具体的类型参数。
// 例如 List<?> 在逻辑上是 List<String>,List<Integer> 等所有 List<具体类型实参> 的父类。


//类型通配符上限通过形如 List<? extends Number> 来定义，如此定义就是通配符泛型值接受Number及其下层子类类型。
//类型通配符下限通过形如 List<? super Number> 来定义，表示类型只能接受 Number 及其上层父类类型，如 Object 类型的实例。


import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void getFirstData(List<?> data){

        System.out.println("Data:"+data.get(0));

    }

    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }



    public static void main(String[] args) {

        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(1);

        getFirstData(name);
        getFirstData(age);
        getFirstData(number);

        System.out.println("===============");

        getUperNumber(age);
        getUperNumber(number);





    }




}
