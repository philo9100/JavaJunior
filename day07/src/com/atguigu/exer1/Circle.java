package com.atguigu.exer1;

import static java.lang.Math.PI;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-19-8:59
 */
public class Circle extends GeometricObject {

    private double radius;

    public Circle(double radius, String color, double weight){
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return PI* radius* radius;
    }
}
