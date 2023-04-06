package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 规定：二维数组分为外层数组的元素，内层数组的元素
 * int[][]arr = new int[4][3];
 * 外层元素：arr[0], arr[1]等
 * 内层元素：arr[0][2], arr[2][1]等
 *
 * >数组元素的默认初始化值
 *
 * >数组的内存解析
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:24
 */
public class ArrayTest5 {

    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        System.out.println(arr[0]);//地址值 [I@52cc8049
        System.out.println(arr[0][0]);//0
        System.out.println(arr);//[[I@5b6f7412

        System.out.println("--------------------");
        float[][] arr1 = new float[4][3];
        System.out.println(arr[0]);//地址值
        System.out.println(arr[0][0]);//0.0

        System.out.println("--------------------");
        String[][] arr2 = new String[4][2];
        System.out.println(arr2[3]);//地址值
        System.out.println(arr2[1][1]);//null

        System.out.println("--------------------");
        double[][] arr3 = new double[4][];
        System.out.println(arr3[1]);//null 数组本身是引用数据类型
        //System.out.println(arr3[1][0]);//报错，二维数组下的一维数组没有数组元素
                                         // 此时的二维数组就相当于一个一维数组每一个位置村的都是null



    }

}
