package com.atguigu.java2;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-26-9:48
 */
public class ReturnExceptionDemo {

    static void methodA(){
        try{
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常"); //抛出一个运行时异常
        } finally {
            System.out.println("用A方法的finall");
        }
    }

    static void methodB(){
        try{
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("调用B方法的finally");
        }
    }

    public static void main(String[] args){
        try{
            methodA();
        } catch(Exception e){
            System.out.println(e.getMessage()); //处理methodA()抛出的运行时异常
        }

        methodB();

        //finally一定会执行
    }


}
