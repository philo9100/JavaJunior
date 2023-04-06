package com.atguigu.java;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author philo
 * @Description
 *
 * java.util.Arrays:操作数组的工具类，里面定义了很多操作数组的方法
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:26
 */
public class ArrayTest14 {

    public static void main(String[] args) {
        int[] arr1=new int[] {1,2,3,4};
        int[] arr2=new int[] {1,3,2,4};

        //1、boolean equals(int[] a,int[] b) :判断两个数组是否相等
        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals);

        //2、String toString(int[] a): 输出数组信息
        System.out.println(Arrays.toString(arr1));

        //3、void fill(int[] a,int val):将指定值填充到数组中
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        //4、void sort(int[] a):对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //5、int binarySearch(int[] a,int key)
        int[] arr3 = new int[]{-98,-34,24,78,98,54,63,35,45};
        int index = Arrays.binarySearch(arr3, 78);
        System.out.println(index);

    }

}
