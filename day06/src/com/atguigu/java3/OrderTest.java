package com.atguigu.java3;

import com.atguigu.java2.Order;

/**
 * @author philo
 * @Description
 *
 * >>>> 体会4种不同的权限修饰符
 *
 * 总结下面三条:
 *
 * 1、在同一个包中，所有的类都能够访问某一个类中所有非private权限的方法或者属性。
 *
 * 2、一个包中的类 不能通过 继承访问另一个包中default权限的方法或者属性。换言之，子类在同一个包中可以访问default权限的方法或属性，子类不在同一个包中则不可以。
 *
 * 3、在不同包中子类是不能通过父类的实例访问protected权限的方法或者变量的。
 * ————————————————
  *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-15-11:30
 */
public class OrderTest {

    public static void main(String[] args) {

        Order order = new Order();

        order.orderPublic = 1;
        order.methodPublic();

        //不同包下的普通类（非子类）要使用Order类，不可以调用声明为Private、缺省、Protected权限的属性、方法
//		order.orderPrivate = 1;
//'orderPrivate' has private access in 'com.atguigu.java2.Order'
// The method methodPrivate() from the type Order is not visible

//		order.orderDefault = 2;
//'orderDefault' is not public in 'com.atguigu.java2.Order'.
//Cannot be accessed from outside package

//		order.orderProtected = 3;
//'orderProtected' has protected access in 'com.atguigu.java2.Order'

//		order.methodPrivate();
//		order.methodDefault();
//		order.methodProtected();


    }

}
