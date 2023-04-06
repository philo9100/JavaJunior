package com.atguigu.java;

import java.util.Random;

/**
 * @author philo
 * @Description
 *
 * Random类，即随机数。用于产生随机数的类
 * 第一步：导包
 * import java.util.Random;//使用Random类，需要先导包
 *
 * 第二步：创建Random类的对象
 * Random r=new Random();//在主函数中使用一个类前，先创建它的对象
 *
 * 第三步：获取随机数
 * int number=r.nextInt(10);//获取int类型随机数，值为0-9 。随机数是从0开始的不包含10
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:27
 */
public class Random0 {

    public static void main(String[] args) {
        Random r = new Random();//创建Random类的对象
        int num = r.nextInt(10);//通过此语句获得一个类型为int的随机数。范围是0-9
        System.out.println(num);
        System.out.println("-------------------------------");

        //需求是获取获取10个随机数
        for(int i = 0; i < 10; i++) {
            int num2=r.nextInt(10);
            System.out.print(num2);
        }

    }
}
