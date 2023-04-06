package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 一、数组的概述
 * 1、数组的理解：数组（Array），是多个相同类型数据按照一定顺序排列的集合，并使用一个名字命名
 *    并通过编号的方式对这些数据进行统一的管理
 *
 * 2、数组的概念：
 *      >数组名：使用一个名字命名
 *      >元素：多个相同类型数据
 *      >角标，下标，索引：通过编号的方式
 *      >数组的长度：元素的个数
 *
 * 3、数组的特点：
 *      >数组是有序排列的
 *      >数组本身属于引用数据类型变量，数组的元素可以是引用数据类型（String），也可以是基本数据类型（double）
 *      >创建数组对象会在内存中开辟一整块连续的空间
 *      >数组的长度一旦确定，就不能修改
 *
 * 4、数组的分类：
 *      >按照维数：一维数组，二维数组。。。
 *      >按照数组元素的类型 ：引用数据类型元素的数组，基本数据类型元素的数组
 *
 * 5、一维数组的使用
 *      >一维数组的声明和初始化
 *      >如何调用数组的指定位置的元素
 *      >如何获取数组的长度
 *      >如何遍历数组
 *      >数组元素的默认初始化值
 *      >数组的内存解析
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-11:39
 */
public class ArrayTest0 {

    public static void main(String[] args) {
        //1、一维数组的声明和初始化

        int num;//声明
        num = 10;//初始化
        int id = 1001;//声明+初始化

        int[] ids;//声明一个数组名为ids，数组元素的类型为基本数据类型int的数组
        //1.1静态初始化：数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001, 1002, 1003, 1004};
        int[] idss = {100, 101, 102, 103};//类型判断，判断出数组元素的数据类型为int类型， new int[]可以省略

        //1.2动态初始化：数组的初始化和数组的赋值操作分开进行
        String[] names = new String[5];

        /*
        错误的写法
        int[] arr1 = new int[];
 		int[5] arr2 = new int[5];
 		int[] arr3 = new int[3]{1,2,3};
         */

        //数组一旦初始化完成，其长度就确定了！！！！

        //2、通过角标的方式调用数组的指定位置的元素
        //数组的角标（或索引）从0开始的，到（数组长度-1）结束
        String[] namess = new String[5];
        namess[0] = "aa";
        namess[1] = "bb";
        namess[2] = "cc";
        namess[3] = "dd";
        namess[4] = "ee";
//        namess[5]="ff"; //语法没错，编译时不报错没有运行时此时并没有在内存中开辟空间
                          //一旦运行就会在内存中开辟一个连续数组长度为5的空间从而显示超过数组长度

        //3、如何获取数组的长度
        //属性：length
        System.out.println(namess.length);
        System.out.println(ids.length);


        //4、如何遍历数组

//		  System.out.println(namess[0]);
//		  System.out.println(namess[1]);
//		  System.out.println(namess[2]);
//		  System.out.println(namess[3]);
//		  System.out.println(namess[4]);

        //当数组元素过多时以上显然不合适，可以用循环
        for (int i = 0; i < namess.length; i++) {
            System.out.println(namess[i]);
        }

        //小技巧：选中要注释掉的内容 ctrl+/进行多行注释；ctrl shift+/进行注释

    }

}
