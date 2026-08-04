package com.liu;


//假设要捕获多个异常，从小到大去捕获；
//ctrl+alt+t 一键生成



/*

实际应用中的经验总结：
    处理运行时异常时，采用逻辑去合理规避同时辅助try-catch处理；
    在多重catch块后面，可以加一个catch(Exception)来处理可能会被遗漏的异常；
    对于不确定的代码，也可以加上try-catch，处理潜在的异常；
    尽量去处理异常，切忌只是简单地调用printStackTrace()去打印输出；
    具体如何处理异常，要根据不同的业务需求和异常类型去决定；
    尽量添加finally语句块去释放占用的资源。

 */




//自定义异常  Testo，MyException；
















public class A_ExceptionNote {
}
