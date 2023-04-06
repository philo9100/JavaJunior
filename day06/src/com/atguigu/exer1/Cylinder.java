package com.atguigu.exer1;

import static java.lang.Math.*;
/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-14-14:30
 */
public class Cylinder extends Circle{

    private double length;

    public Cylinder(){
        length = 1.0;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    /**
     *
     * @return 圆柱的体积
     */
    public double findVolume(){
//        return Math.PI * getRadius() * getRadius() * getLength();
        //或
        return  super.findArea()* getLength();
        //子类重写了父类的findArea()方法,要想还调用父类的方法就要用super关键字
    }

    /**
     * 重写父类的方法，返回圆柱的表面积
     * 此时子类的findArea方法覆盖了父类的findArea方法
     * @return
     */
    @Override
    public double findArea() {
        return PI* getRadius()* getRadius()* 2 +
                2* PI* getRadius()* getLength();
    }

    public double baseArea(){
        return super.findArea();
    }

}
