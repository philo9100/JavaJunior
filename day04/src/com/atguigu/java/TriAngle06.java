package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和height，同时声明公共方法访问私有变量。
 * 此时，提供类必要的构造器，另一个类中使用这些公共方法，计算三角形的面积
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-9:55
 */
public class TriAngle06 {

    //属性
    private double base;//底边长
    private double height;//高

    //构造器
    public TriAngle06(){}
    public TriAngle06(double b, double h){
        base = b;
        height = h;
    }

    //方法
    public void setBase(double b){
        base = b;
    }
    public double getBase(){
        return base;
    }

    public void setHeight(double h){
        height = h;
    }
    public double getHeight(){
        return height;
    }


}
