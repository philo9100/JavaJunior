package com.atguigu.exer3;

/**
 * @author philo
 * @Description
 *
 * 定义一个Circle类，声明radius属性，提供getter和setter方法
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-25-15:47
 */
public class Circle {

    private Double radius; //看清楚是包装类 不是基本数据类型double

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}
