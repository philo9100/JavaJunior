package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * >>>数组的赋值
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:27
 */
public class ArrayTest10 {

    public static void main(String[] args) {
        int[] array1, array2;
        array1 = new int[]{1, 3, 4, 5, 6, 9, 8, 6};

        //遍历显示array1
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

        //array2复制array1 动态初始化array2 长度与array1的长度相同 遍历显示array2
        array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
            System.out.print(array2[i] + "\t");
        }
        System.out.println();

        //修改array2
        for (int i = 0; i < array2.length; i++) {
            if(i % 2 == 0){
                array2[i] = i;
            }
            System.out.print(array2[i] + "\t");
        }
        System.out.println();

        //再次打印array1
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }

    }

}
