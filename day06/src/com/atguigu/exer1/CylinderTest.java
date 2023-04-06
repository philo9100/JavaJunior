package com.atguigu.exer1;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-14-14:30
 */
public class CylinderTest {

    public static void main(String[] args) {

        Cylinder cy =new Cylinder();

        cy.setRadius(2.1);
        cy.setLength(3.4);
        double volume = cy.findVolume();
        System.out.println("圆柱的体积为：" + volume);

        double area = cy.findArea();
        double baseArea = cy.baseArea();
        System.out.println("底面圆的面积为：" + baseArea);

    }

}
