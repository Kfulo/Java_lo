package com.liu;


//2026.8.6


public class CharacterClass {

    public static void main(String[] args) {

        char ch = 'a';

        // Unicode 字符表示形式
        char uniChar = '\u039A';
        // 字符数组
        char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };

        System.out.println(ch+" "+uniChar);

        Character cch = new Character('a');


    /*
        \t	在文中该处插入一个tab键
        \b	在文中该处插入一个后退键
        \n	在文中该处换行
        \r	在文中该处插入回车
        \f	在文中该处插入换页符
        \'	在文中该处插入单引号
        \"	在文中该处插入双引号
        \\	在文中该处插入反斜杠
    */
        //转义字符
        System.out.println("访问\"菜鸟教程!\"");















    }
}
