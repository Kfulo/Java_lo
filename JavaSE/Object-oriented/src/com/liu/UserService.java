package com.liu;


//2026.7.24


public interface UserService {

    //接口中的属性默认是常量   public static final
    public static final int AGE = 99;
    int SCORE = 150;








    //接口中的所有定义都是抽象的    public abstract
    public abstract void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);







}
