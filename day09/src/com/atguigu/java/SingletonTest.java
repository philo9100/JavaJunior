package com.atguigu.java;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-21-20:50
 */
public class SingletonTest {

    public static void main(String[] args) {

        Bank bank1 = Bank.instance;

//        Bank.instance = null;
//        Cannot assign a value to final variable 'instance'

        Bank bank2 = Bank.instance;

        System.out.println(bank1 == bank2);//true 地址指相同是同一个对象

    }

}


//在类中只new了一次说明是只有一个对象实例，加了一个final关键字没法再进行修改
//不能设置成null，算是单例模式
class Bank{

    private Bank(){}

    public static final Bank instance = new Bank();

}