package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 通过数组读出电话号码
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:16
 */
public class ArrayTest2 {

    public static void main(String[] args) {
        int[] arr = new int[] {8,2,1,7,6,9,3};
        int[] index = new int[] {2,0,5,6,3,4,3,3,5,2,1};
        String tel = "";

        for(int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.print("联系方式："+tel);

    }
}
