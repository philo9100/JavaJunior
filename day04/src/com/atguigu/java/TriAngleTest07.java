package com.atguigu.java;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-12-10:04
 */
public class TriAngleTest07 {

    public static void main(String[] args) {

        TriAngle06 t1 = new TriAngle06();

        t1.setBase(2.0);
        t1.setHeight(2.4);
//		t1.base = 2.0; //The field TriAngle06.base is not visible
        //'base' has private access in 'com.atguigu.java.TriAngle06'
//		t1.height = 2.4; //The field TriAngle06.base is not visible
        //'height' has private access in 'com.atguigu.java.TriAngle06'
        System.out.println("base = " + t1.getBase() + " , height = " + t1.getHeight());

        TriAngle06 t2 = new TriAngle06(5.1 , 5.6);
        System.out.println("base = " + t2.getBase() + " , height = " + t2.getHeight());


    }
}
