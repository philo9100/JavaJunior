package com.atguigu.exer;

/**
 * @author philo
 * @Description
 *
 * 定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-14-14:23
 */
public class KidsTest {

    public static void main(String[] args) {


        Kids somekid = new Kids(12);

        somekid.printAge();

        somekid.setSalary(0);
        somekid.setSex(1);

        somekid.employeed();
        somekid.manOrWoman();

        ManKind someMan = new ManKind();
        someMan.setSalary(5000);
        someMan.employeed();

    }

}
