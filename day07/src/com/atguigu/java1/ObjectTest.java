package com.atguigu.java1;

/**
 * @author philo
 * @Description
 *
 * java.lang.Object类
 * 1.Object类是所有Java类的根父类
 * 2.如果在类的声明中未使用extends关键字指明其父类，则默认父类为java.lang.Object类
 * 3.所以Object类中的功能(属性、方法)具有通用性
 * 	属性：无
 *	方法：equals()/ toString()/ getClass()/ hashCode()/ clone()/ finalize()
 * 		wait()/ notify()/ notifyAll()
 * 4.Object类中只声明了一个空参构造器，因为所有子类对象都会调到该构造器
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-17-12:08
 */
public class ObjectTest {

    public static void main(String[] args) {

        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());//显示类的根父类

    }

}

class Order{}