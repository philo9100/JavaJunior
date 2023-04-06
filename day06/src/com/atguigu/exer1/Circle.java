package com.atguigu.exer1;

import static java.lang.Math.*;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-14-14:30
 */
public class Circle {

    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return 圆的面积
     */
    public double findArea(){
        return PI * radius * radius;
    }

}
