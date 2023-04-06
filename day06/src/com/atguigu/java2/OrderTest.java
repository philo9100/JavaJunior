package com.atguigu.java2;

/**
 * @author philo
 * @Description
 *
 * >>>> 体会4种不同的权限修饰符
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-15-11:18
 */
public class OrderTest {

    public static void main(String[] args) {

        Order order = new Order();

        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        //同一个包中的其它类，不可以调用Order类中的私有的属性、方法
//        order.orderPrivate = 4;
//        'orderPrivate' has private access in 'com.atguigu.java2.Order'

//        order.methodPrivate();
//        'methodPrivate()' has private access in 'com.atguigu.java2.Order'

    }
}
