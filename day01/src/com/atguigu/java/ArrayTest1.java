package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 数组元素的默认初始化值
 * >数组元素是整型：0
 * >数组元素是浮点型：0.0
 * >数组元素是char型：ASCll中的0或'\u0000',而非'0'
 * >数组元素是boolean型：false
 *
 * >数组元素是引用数据类型：null
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-12:50
 */
public class ArrayTest1 {

    public static void main(String[] args) {
        //5、数组元素的默认初始化值

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        double[] arr1 = new double[4];
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }

        System.out.println();

        char[] arr2 = new char[4];
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();
        if(arr2[3] == 0)
            System.out.print("你好！");//能运行出来"你好！"说明确实对应ASCll中的0而非'0'

        System.out.println();

        boolean[] arr3=new boolean[5];
        System.out.print(arr3[4]);

        System.out.println();

        String[] arr4=new String[5];
        System.out.print(arr4[0]);

    }
}
