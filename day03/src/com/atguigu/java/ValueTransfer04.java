package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 关于变量的赋值
 *
 *  	如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
 *
 *  	如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值。（引用数据类型变量要么赋值null，要么赋值地址值）
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-11-12:11
 */
public class ValueTransfer04 {

    public static void main(String[] args) {

    //*********************基本数据类型**************************
        int m = 10;

        int n = m; //对于基本数据类型，此时赋值的 n 是 m 所保存的数据值

        System.out.println("m = " + m + ", n = " + n);

        n = 20;

        System.out.println("m = " + m + ", n = " + n);

    //*********************引用数据类型**************************

        Order o1 = new Order();

        o1.orderId = 1001;

        Order o2 = o1; //对于引用数据类型，此时赋值的 o2 是 o1 所保存的数据的地址值
                       //（o1、 o2都是栈空间的变量通过相同的地址值指向了堆空间中的同一个对象实体）

        System.out.println("o1.orderId = " + o1.orderId + ", o2.orderId = " + o2.orderId );

        o2.orderId = 1002; //通过修改o2 就是通过地址值修改堆空间的同一个对象实体

        System.out.println("o1.orderId = " + o1.orderId + ", o2.orderId = " + o2.orderId );

    }

}

class Order{
    int orderId;
}