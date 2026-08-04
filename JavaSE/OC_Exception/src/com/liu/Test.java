package com.liu;

public class Test {


    public static void main(String[] args) {

        int a = 11;
        int b = 0;


        try{                                    //监控区域
            new Test().a();
        }catch (Error e){                       //捕获异常
            System.out.println("Error!");
        }catch (Exception e){
            System.out.println("Exception!");
        }catch (Throwable e){
            System.out.println("Throwable!");
        }finally {                              //处理善后工作（可以没有）
            System.out.println("Finally！");
        }


        System.out.println("=========================================================");
        System.out.println("=========================================================");

        new Test().test(22,0);

    }



        public void a(){
            b();
        }

        public void b(){
            a();
        }


        //假设这个方法中，处理不了这个异常，方法上抛出异常
        public void test(int a,int b) throws ArithmeticException{

            if(b == 0){
                throw new ArithmeticException();    //主动抛出异常，一般在方法中使用
            }
            System.out.println(a/b);

        }






}
