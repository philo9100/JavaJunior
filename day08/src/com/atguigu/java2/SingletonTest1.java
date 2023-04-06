package com.atguigu.java2;

/**
 * @author philo
 * @Description
 *
 * 单例设计模式：
 * 1. 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。
 *
 * 2. 如何实现？
 * 	 饿汉式  vs 懒汉式
 *
 * 3. 区分饿汉式 和 懒汉式
 *   饿汉式：
 *   	坏处：对象加载时间过长。
 *   	好处：饿汉式是线程安全的
 *
 *   懒汉式：好处：延迟对象的创建。
 * 		  目前的写法坏处：线程不安全。--->到多线程内容时，再修改
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-21-11:55
 */
public class SingletonTest1 {

    public static void main(String[] args) {
//        Bank bank1 = new Bank();
//        Bank bank2 = new Bank();
//'Bank()' has private access in 'com.atguigu.java2.Bank'

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);//true;

    }

}

//饿汉式
class Bank{

    //1.私有化类的构造器
    //目的是避免在该类的外部调用构造器创建对象实例
    private Bank(){}

    //2.内部创建类的对象
    //既然没法在类的外部调用构造器那么只能在类的内部造对象实例，也可以看成是类的属性。考虑私有化通过方法去调

    //4.要求此对象也必须声明为静态的
    //在该类外部调用创建好的这个对象实例，而且没法在该类外部创建对象，只能使用静态结构调用该对象
    //get方法是静态的只能调用静态结构，所以instance必须为静态的
    private static Bank instance = new Bank();

    //3.提供公共的静态的方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }

}



