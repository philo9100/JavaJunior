package com.atguigu.java2;

/**
 * @author philo
 * @Description
 *
 * 单例模式的懒汉式实现
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-21-11:56
 */
public class SingletonTest2 {

    public static void main(String[] args) {

        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);//true 地址值相同是同一个对象

    }

}

class Order{

    //1.私有化类的构造器
    private Order(){}

    //2.声明当前类对象，没有初始化
    //4.此属性也必须声明为static的，静态方法中只能调用静态结构
    private static Order instance = null;//开始的时候不会创建对象，什么时间用什么时间创建对象

    //3.声明public、static的返回当前类对象的方法
    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }

}