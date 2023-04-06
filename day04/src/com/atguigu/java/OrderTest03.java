package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * >>>>>权限修饰符测试
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-9:26
 */
public class OrderTest03 {

    public static void main(String[] args) {

        Order02 order = new Order02();

        order.orderDefault = 1;
        order.orderPublic = 2;
        //出了Order类之后，私有的结构就不可以调用了
//		order.orderPrivate = 3; //The field Order02.orderPrivate is not visible


        order.methodDefault();
        order.methodPublic();
        //出了Order类之后，私有的结构就不可以调用了
//		order.methodPrivate();//The method methodPrivate() from the type Order02 is not visible



    }

}
