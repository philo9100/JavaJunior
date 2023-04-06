package com.atguigu.java;

import java.util.Scanner;

/**
 * @author philo
 * @Description >>> 查找
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:26
 */
public class ArrayTest12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[]{"AA", "BB", "CC", "DD", "EE", "FF", "GG"};

        String dest = input.next();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                System.out.println("找到了指定的元素，位置为：" + "第" + i + "个");
                isFlag = false;
                break;
            }
        }
        if (isFlag) { //isFlag = true;
            System.out.println("很遗憾！没有找到指定元素");
        }


    }
}
