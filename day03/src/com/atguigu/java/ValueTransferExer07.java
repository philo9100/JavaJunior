package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 考察参数的值传递
 *
 * 1.定义一个Circle类，包含一个double类型的radius属性代表圆的半径
 *   一个findArea()方法返回圆的面积
 *
 * 2.定义一个类PassObject，在类中定义一个方法printAreas()
 *   该方法定义如下：public void printAreas(Circle c , int time)
 *   在printAreas方法中打印输出1到time直间的每个整数半径值，以及对应的面积
 *   例如，time为5，则输出半径1，2，3，4，5，以及对应的面积
 *
 *
 * 在main方法中调用printAreas()方法，调用完毕后输出当前半径值
 * @email 3424586889@qq.com
 * @Date 2021-09-11-13:27
 */
class PassObject{

    public void printAreas(Circle c, int times){

        System.out.println("Radius\t\tArea");

        int i = 1;
        for ( ; i <= times; i++) {
            //设置圆的半径
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }
        c.radius = i;
    }


}


public class ValueTransferExer07 {

    public static void main(String[] args) {

        Circle c = new Circle();

//        PassObject test = new PassObject();

        new PassObject().printAreas(c, 5);

        System.out.println("now radius is " + c.radius);

    }

}


class Circle{

    double radius; //半径

    /**
     * @return 圆的面积
     */
    public double findArea(){
        return Math.PI*radius*radius;
    }

}










