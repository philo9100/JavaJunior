package com.atguigu.java1;

import java.util.Date;

/**
 * @author philo
 * @Description
 *
 * Object类中toString()的使用
 *
 * 1.
 *	当我们输出一个对象的引用时，实际上就是调用当前对象的toString()方法
 *
 * 2.Object类中定义的toString()方法
 * 	public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 *
 * 3.
 * 	像String、Date、File、包装类等都重写了Object类中的toString()方法
 * 	使得在调用对象的toString方法时，返回对象的“实体内容”
 * 4.
 * 	自定义类也可以重写toString方法，当调用此方法时，返回对象的“实体内容”
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-17-12:08
 */
public class ToStringTest {

    public static void main(String[] args) {

        Customer cust1 = new Customer("Tom", 21);
        System.out.println(cust1.toString());//com.atguigu.java1.Customer@27973e9b
        System.out.println(cust1); //默认打印toString() com.atguigu.java1.Customer@27973e9b
        //自定义类中并未重写toString() 调用的就是Object类中的toString()

        String str = new String("MM");
        System.out.println(str.toString());//打印之后显示MM而不是地址值，说明String类中重写了toString()

        Date date = new Date(45125465125462365L);
        System.out.println(date.toString());//重写了Object类中的toString()方法
    }

    //手动toString
    @Override
    public String toString() {
//		return super.toString();//返回的是Object类的的toString()方法
        return null;
    }

}
