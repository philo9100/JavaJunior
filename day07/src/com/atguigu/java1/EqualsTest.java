package com.atguigu.java1;

/**
 * @author philo
 * @Description
 *
 * 面试题： == 和 equals() 的区别
 * 一、回顾==的使用
 * == 运算符
 * 1.可以使用在基本数据类型变量和引用数据变量中
 * 2.如果比较的是基本数据类型变量，比较两个变量保存的数据是否相等。（不一定类型要相同）
 * 	 如果比较的是引用数据类型变量，比较两个对象的地址值是否相同,即两个引用是否指向同一个对象实体
 *
 * 二、equals()方法的使用
 * 	1.是一个方法，而非运算符
 * 	2.只能适用于引用数据类型
 * 	3.Object类中的equals()的定义
 *  public boolean equals(Object obj) {
            return (this == obj);
    }
    说明：Object 类中的定义的equals()方法和==的作用一样，比较两个对象的地址值是否相同，及两个引用是否指向同一个对象
 *
 * 	4.String Date File 包装类都重写了Object类中的equals方法，重写以后，比较的不是两个引用的地址值是否相同，
 * 	  而是比较两个对象的"实体内容"是否相同
 *
 * 	5.通常情况下，我们自定义类如果要使用equals方法的话，也是比较两个对象的 "实体内容"是否相同 ，
 * 		需要对Object类中的equals()进行重写
 * 		重写的原则：比较两个对象的实体内容（name 和 age）是否相同
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-17-12:07
 */
public class EqualsTest {

    public static void main(String[] args) {

        //基本数据类型
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);//true
        System.out.println(i == d);//true

        boolean b = true;
//		System.out.println(i == b);
        //The operator == is undefined for the argument type(s) int, boolean

        char c = 10;
        System.out.println( i == c);//true

        char c1 = 'A';
        char c2 = 65;
        System.out.println( c1 == c2);//true

        //引用数据类型
        Customer cust1 = new Customer("Tom", 21);
        Customer cust2 = new Customer("Tom", 21);
        System.out.println(cust1 == cust2); //地址值不同 false

        String str1 = new String("atguigu");
        String str2 = new String("atguigu");
        System.out.println(str1 == str2);//false

        System.out.println("*************************************");
        System.out.println(cust1.equals(cust2)); //false
        System.out.println(str1.equals(str2)); //true String重写了equals()

    }

}
