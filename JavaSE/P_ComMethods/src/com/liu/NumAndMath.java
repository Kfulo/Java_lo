package com.liu;

//2026.8.6


public class NumAndMath {

    public static void main(String[] args) {

        Number num = 1234.56; // 实际是Double类型

        System.out.println(num.intValue());    // 1234 (截断小数)
        System.out.println(num.longValue());   // 1234
        System.out.println(num.floatValue());  // 1234.56
        System.out.println(num.doubleValue()); // 1234.56

        System.out.println("===================================================");
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);

        System.out.println("===================================================");
        System.out.println(Math.PI);    // π ≈ 3.141592653589793
        System.out.println(Math.E);     // 自然对数底数e ≈ 2.718281828459045
        System.out.println(Math.exp(1));    // e^1 ≈ 2.718
        System.out.println(Math.log(Math.E)); // ln(e) = 1
        System.out.println(Math.log10(100)); // log10(100) = 2

        System.out.println("===================================================");
        // 生成[0.0, 1.0]之间的随机数
        double random = Math.random();
        // 生成[1, 100]的随机整数
        int randomInt = (int)(Math.random() * 100) + 1;
        System.out.println(random+"  "+randomInt);

        System.out.println("===================================================");





























    }
}
