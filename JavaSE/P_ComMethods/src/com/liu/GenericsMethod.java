package com.liu;

//2026.8.6

/*
定义泛型方法的规则：
所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的 <E>）。
每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像 int、double、char 等）。

java 中泛型标记符：
E - Element (在集合中使用，因为集合中存放的是元素)
T - Type（Java 类）
K - Key（键）
V - Value（值）
N - Number（数值类型）
？ - 表示不确定的 java 类型

有界的类型参数:
    可能有时候，你会想限制那些被允许传递到一个类型参数的类型种类范围。
    例如，一个操作数字的方法可能只希望接受Number或者Number子类的实例。这就是有界类型参数的目的。
    要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界。

*/


public class GenericsMethod {

    //泛型方法
    public static <E> void printArray(E[] inputArray){

        for( E element : inputArray){       //输出数组元素
            System.out.print(element+"\t");
        }
        System.out.println();
    }

    //比较三个数2返回最大值
    public static <T extends Comparable<T> >  T  maximum(T x,T y,T z){

        T max = x;
        if ( y.compareTo( max ) > 0 ){
            max = y;            //y 更大
        }
        if ( z.compareTo( max ) > 0 ){
            max = z;            // 现在 z 更大
        }
        return max;             // 返回最大对象

    }



    public static void main(String[] args) {

        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3};
        Character[] charArray = {'H','E','L','L','O'};

        System.out.println( "整型数组元素为:" );
        printArray(intArray); // 传递一个整型数组

        System.out.println( "\n双精度型数组元素为:" );
        printArray(doubleArray); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printArray(charArray); // 传递一个字符型数组


        System.out.printf(
                "%d, %d 和 %d 中最大的数为 %d\n\n",
                15, 2, 5, maximum( 15, 2, 5 )
        );

        System.out.printf(
                "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 )
        );













    }
}
