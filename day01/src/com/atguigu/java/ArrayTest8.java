package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 数组中涉及的常见算法
 * 1、数组的元素赋值（杨辉三角、回型等）
 * 2、求数值型数组中元素的最大值，最小值，平均值，总和等
 * 3、数组的复制，反转，查找（线性查找，二分法查找）
 * 4、数组元素的排序算法
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:25
 */
public class ArrayTest8 {

    public static void main(String[] args) {
        /*
        定义一个int 型的一维数组，包含10个元素，分别赋一些随机整数
        求出所有元素的最大值，最小值，平均值，并输出。
        要求：所有数都是在两位数。
        [10,99]
        公式：(Math.random()*(99-10+1)+10) //默认是double类型的
         */
        int[] arr = new int[10];

        //遍历给每个元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*(99-10+1)+10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //求数组元素的最大值
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("最大值为" + maxValue);

        //求数组元素的最小值
        int minValue = arr[0];
        for(int i = 0; i < arr.length; i++ ){
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        System.out.println("最小值为" + minValue);

        //求数组元素的总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和为" + sum);

        //求数组元素的平均值
        double avgValue = sum/arr.length;
        System.out.println("平均值为" + avgValue);

    }

}
