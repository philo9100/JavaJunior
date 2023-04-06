package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 使用二维数组打印一个10行杨辉三角形
 *
 * 【提示】
 * 1、第一行有1个元素，第n行有n个元素
 * 2、每一行的第一个元素和最后一个元素都是1
 * 3、从第三行开始，对于非第一个元素和最后一个元素，即
 *    yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:25
 */
public class ArrayTest7 {

    public static void main(String[] args) {
        //1、声明并初始化二维数组，动态初始化
        int[][] yanghui = new int[10][];

        //2、给数组的元素赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];//二维数组的第i个元素也就是一维数组，给一维数组创建元素个数

            //2.1给每行的首末元素赋值
            yanghui[i][0] = yanghui[i][i] = 1;//每一行有（i+1）个元素，最后一个元素的角标为i
            //2.2给每行的非首末元素赋值
            for (int j = 1; j < yanghui[i].length-1; j++) {
                yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
            }
        }

        //3、遍历二维数组
        for (int i = 0; i < yanghui.length; i++) {
            for(int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }


    }

}
