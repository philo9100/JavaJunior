package com.atguigu.exer;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-21-20:45
 */
public abstract class GeometricObject {//几何图形

    protected String color;
    protected double weight;

    public GeometricObject(String color, double weight){
        super();
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double findArea();

}
