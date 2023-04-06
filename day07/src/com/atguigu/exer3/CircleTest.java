package com.atguigu.exer3;

/**
 * @author philo
 * @Description
 *
 * 写一个测试类，创建两个Circle对象，判断其颜色是否相等
 * 利用equals方法判断其半径是否相等，利用toString方法输出其半径值
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-19-14:51
 */
public class CircleTest {

    public static void main(String[] args) {

        Circle circle1 = new Circle(2.3);
        Circle circle2 = new Circle(2.3, "white", 2.0);

        System.out.println("颜色是否相等" + circle1.getColor().equals(circle2.getColor()));

        //Circle类中重写过比较半径是否相等的equals方法
        System.out.println("半径是否相等" + circle1.equals(circle2));

        System.out.println(circle1);//默认打印的是Circle类中重写的toString()
        System.out.println(circle1.toString());

    }

}
