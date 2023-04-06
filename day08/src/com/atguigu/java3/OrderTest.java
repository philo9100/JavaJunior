package com.atguigu.java3;



/**
 * @author philo
 * @Description
 *
 * 对属性可以赋值的位置：
 * ①默认初始化 （final修饰除外）
 * ②显式初始化/⑤在代码块中赋值
 * ③构造器中初始化
 * ④有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值
 *
 *
 * 执行的先后顺序：① - ② / ⑤ （按在类中编写的先后顺序） - ③ - ④
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-21-13:22
 */
public class OrderTest {

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);

    }

}

class Order{

    int orderId = 3;

    {
        orderId = 4;
    }

}


