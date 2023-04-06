package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 *  方法的形参的传递机制：值传递
 *
 *  1.形参：方法定义时，声明在小括号内的参数
 *    实参：方法调用时，实际传递给形参的数据
 *
 *  2.值传递机制：
 *    如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值
 *    如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-11-12:19
 */
public class ValueTransfer05 {

    public static void main(String[] args) {

        int m = 10;

        int n = 20;

        System.out.println("m = " + m + ", n = " + n);

        //交换两个变量的值的操作
//		int temp = m;
//		m = n;
//		n = temp;
        //以上操作在main中执行，main本质上是一个方法，以上执行交换的操作就是main的方法体的一部分
        //会随着main的结束而结束，main在打印完交换的m， n后结束

        ValueTransfer05 test = new ValueTransfer05();

        test.swap(m, n);
        System.out.println("m = " + m + ", n = " + n);
        /*
         * 输出值后依然是m=10，n=20 因为在swap方法中m和n确实交换了，但是m和n是定义在main方法中
         * 的临时变量通过基本数据类型的值传递机制将m，n赋给了swap方法，swap方法在栈空间中的操作完之后
         * 自动就出栈了没有将交换过后的m，n保存，所以输出的依然是没交换前的m，n
         */
    }

    //交换两个变量值的方法
    public void swap(int m , int n) {
        int temp = m;
        m = n;
        n = temp;
//        System.out.println("m = " + m + ", n = " + n);m = 20, n = 10; 说明确实是在执行完后出栈了

    }

}
