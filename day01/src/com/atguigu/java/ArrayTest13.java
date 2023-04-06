package com.atguigu.java;

import java.util.Scanner;

/**
 * @author philo
 * @Description
 *
 * 冒泡排序法
 * 快速排序法（暂不研究）
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:26
 */

public class ArrayTest13 {

    public static void main(String[] args) {

        int [] arr = new int[] {19,85,6,87,-9,36,5,4,-8,76};
        /*
         * 冒泡排序
         * 外层循环控制几大轮排序，9个元素要进行9轮排序，因为最后还剩一个不用再进行排序
         * 所以实际进行了8轮排序也就是(元素个数-1)轮
         * 内层循环控制每一大轮内俩俩比较有几小轮排序，因为每循环一大轮就少一个元素，数组元素个数-1-i
         */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //遍历显示数组中每一个元素
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"\t");

        }
        System.out.println();

    }

}
