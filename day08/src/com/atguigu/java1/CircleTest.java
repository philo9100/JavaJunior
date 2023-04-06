package com.atguigu.java1;

import static java.lang.Math.PI;
/**
 * @author philo
 * @Description
 *
 * static关键字的应用
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-19-17:36
 */
public class CircleTest {

    public static void main(String[] args) {

        System.out.println(Circle.getTotal());

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println(Circle.getTotal());
        System.out.println(Circle.getInit());

        Circle c3 = new Circle(3.4);

        System.out.println("c1的id：" + c1.getId() );
        System.out.println("c2的id：" + c2.getId() );
        System.out.println("c3的id：" + c3.getId() );

        System.out.println("创建的圆的个数为：" + Circle.getTotal());

    }

}

class Circle{

    private double radius;
    private int id;//自动赋值
    private static int total;//记录创建的圆的个数
    private static int init = 1001;//static声明的属性被所有对象所共享

    public Circle(){
        id = init++;
        total++;
    }

    public Circle(double radius){
        this();
//		id = init++;
//		total++;
        this.radius = radius;
    }

    public double findArea(){
        return PI* radius* radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }

    public static int getInit(){
        return init;
    }

}