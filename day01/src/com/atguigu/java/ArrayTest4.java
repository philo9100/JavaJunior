package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 二维数组的理解
 * 对于二维数组的理解，我们可以看成是一维数组Array1作为另一个一维数组Array2的元素而存在。
 * 其实，从数组底层的运行机制来看，其实没有多维数组
 * 因为数组本身就是引用数据类型，而数组的元素可以是基本数据类型也可以是引用数据类型
 * 所以一个数组可以作为另一个数组的元素
 *
 * 1、二维数组的使用
 *      >二维数组的声明和初始化
 *      >如何调用数组的指定位置的元素
 *      >如何获取数组的长度
 *      >如何遍历数组
 *      >数组元素的默认初始化值
 *      >数组的内存解析
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:17
 */
public class ArrayTest4 {

    public static void main(String[] args) {
        //1、 二维数组的声明和初始化
//		 int[] arr = new int[] {1,2,3};
//		 int arr1[] = {1,2,3};//一维数组 类型推断可以省略 new int[]

        //静态初始化
        int[][] arr1 = new int[][] {
                {1, 2},
                {1, 2, 3},
                {5, 8, 7},
                {1, 2}
        };
        //动态初始化1
        String[][] arr2 = new String[3][2];//明确一维数组的长度(元素个数)
        //动态初始化2
        String[][] arr3 = new String[3][];//不明确一维数组的长度(元素个数)

        //其他正确写法
        int[] arr4[] = new int[][] {{1, 2, 3}, {4, 5, 9, 10}, {6, 7, 8}};
        int[] arr5[] = {{1, 2}, {15, 4}, {}};

        //2、如何调用二维数组的指定位置的元素
        System.out.println(arr1[0][1]);//2
        System.out.println(arr2[1][1]);//null

        System.out.println(arr3[1][0]);//报错，空指针异常
        arr3[1] = new String[4];//动态初始化给一维数组创建数组长度（元素个数）
        //数组名后的中括号里指的是某一个元素
        //数据类型后面的中括号里指的是元素个数
        System.out.println(arr3[1][0]);//null

        //3、获取数组长度
        System.out.println(arr4.length);//3
        System.out.println(arr4[0].length);//3
        System.out.println(arr4[1].length);//4

        //4、如何遍历二维数组
        for(int i = 0; i < arr4.length; i++) {

            for(int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
