package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 *利用面向对象的编程方法，设计类Circle计算圆的面积
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-10-11:46
 */
public class circleTest {

    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 2.1;

        //法一
        double area=c1.findArea();
        System.out.println(area);

        System.out.println("***************");
        //法二
        c1.findArea1();

    }

}


class Circle{
    //属性
    double radius;

    //求圆的面积
    //方法一、有返回值
    public double findArea(){
        double area = Math.PI* radius* radius;
        return area;
    }
    //方法二、没有返回值
    public void findArea1(){
        double area = Math.PI* radius* radius;
        System.out.println("圆的面积是" + area);
    }



}

