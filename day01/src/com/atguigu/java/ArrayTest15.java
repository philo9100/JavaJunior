package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 常见的数组异常
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:25
 */
public class ArrayTest15 {

    public static void main(String[] args) {

        //1、数组角标越界：ArrayIndexOutOfBoundsException
//        int[] arr = new int[]{1, 2, 3, 4, 5};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println(arr[-2]);


        //2、空指针异常：NullPointerException
        //情况一：
//        int[] arr1 = new int[] {1, 2, 3};
//        arr1 = null;
//        System.out.println(arr1[0]);

        //情况二：
//        int[][] arr2 = new int[4][];
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + "\t"); //null null null null
//        }
//        System.out.println(arr2[0][0]);

        //情况三：
        String[] arr3 = new String[]{"AA", "BB", "CC"};
        arr3[0] = null;
        System.out.println(arr3[0]);//"null"

    }

}
