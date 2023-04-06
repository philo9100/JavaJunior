package com.atguigu.java;

import javax.xml.crypto.Data;

/**
 * @author philo
 * @Description
 *
 *   见课程 209 —— 211
 *   重点211课
 *                          >>>>通过画出内存结构可以直观清晰的看出过程
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-11-13:01
 */
public class ValueTransfer06 {

    public static void main(String[] args) {

        Data1 data = new Data1();

        data.m = 10;
        data.n = 20;

        System.out.println("m = " + data.m + ", n = " + data.n);

        //交换 m 和 n 的值

        //方法一
//		int temp = data.m;
//		data.m = data.n;
//		data.n = temp;
//		System.out.println("m = " + data.m + ", n = " + data.n);


        //方法二
//        ValueTransfer06 test = new ValueTransfer06();
        swap(data);
        System.out.println("m = " + data.m + ", n = " + data.n);

    }

    public static void swap(Data1 data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

}

class Data1{
    int m, n;
}



