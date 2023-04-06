package com.atguigu.java3;

import com.atguigu.java2.Order;

/**
 * @author philo
 * @Description
 *
 * >>>> 体会4种不同的权限修饰符
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-17-8:53
 */
public class SubOrder extends Order {


    public void method(){
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

//在不同包的子类中，不能调用Order类中的声明为Private和缺省权限的属性、方法
//        orderDefault = 3;
//        orderPrivate = 4;
//
//        methodDefault();
//        methodPrivate();
    }


}
