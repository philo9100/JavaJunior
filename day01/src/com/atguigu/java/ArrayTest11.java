package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 *算法的考察：
 * 数组的复制、反转、查找（线性查找、二分法查找）
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:26
 */
public class ArrayTest11 {

    public static void main(String[] args) {
        String[] arr = new String[] {"hilbert","bob","scofield","eulr","steven","guozihao"};

        //数组的复制(区别于数组的赋值 arr=arr1;)
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();

        //数组的反转
        //方法1、
        //for(int i = 0; i < arr.length; i++) 从第一个反转到最后一个等于没有反转
        for (int i = 0; i < arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;//先声明一个与元素数据类型相同的空变量
                                            //把元素中的第一个赋给空变量，再把元素的最后一个
                                            //赋给第一个，再把装有第一个元素的空变量赋给最后一个
                                            //如果元素有偶数个很明确反转到（元素个数）/2那个元素
                                            //如果有奇数个元素反转到第（元素个数-1）/2那个元素
                                            //经推理若有奇数个元素 i<arr.length/2 判断条件依然成立
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //方法2、
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr[i] + "\t");
        }


    }

}
