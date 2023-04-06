package com.atguigu.java1;

import com.atguigu.java.Order02;

/**
 * @author philo
 * @Description
 *
 *   >>>>>用于测试权限修饰符的类
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-10:56
 */
public class OrderTest {

    public static void main(String[] args) {

        Order02 order = new Order02();

        order.orderPublic = 2;

        //出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
//		order.orderDefault = 1;//The field Order02.orderDefault is not visible
                //'orderDefault' is not public in 'com.atguigu.java.Order02'.
                // Cannot be accessed from outside package

        // 出了Order类之后，私有的结构就不可以调用了
//		order.orderPrivate = 3; //The field Order02.orderPrivate is not visible
                //'orderPrivate' has private access in 'com.atguigu.java.Order02'


        order.methodPublic();

        //出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
//		order.methodDefault(); //The method methodDefault() from the type Order02 is not visible
                //'methodDefault()' is not public in 'com.atguigu.java.Order02'.
                // Cannot be accessed from outside package


        // 出了Order类之后，私有的结构就不可以调用了
//		order.methodPrivate();//The method methodPrivate() from the type Order02 is not visible
                //'methodPrivate()' has private access in 'com.atguigu.java.Order02'

    }

}
