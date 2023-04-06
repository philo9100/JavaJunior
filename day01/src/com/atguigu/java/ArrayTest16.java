package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * >>>练习数组的常用方法   >>>>>此页二分查找 (要求数组有序)
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-09-17:54
 */
public class ArrayTest16 {

    public static void main(String[] args) {
        // 1、使用冒泡排序，实现如下从小到大的排序
        int[] arr=new int[] {34,5,22,-98,6,-76,0,-3};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < args.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j +1 ] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println();

        //2、反转
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println();

        //4、复制上述数组
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        //5、线性查找，查找22是否存在
        int a = 22;
        boolean Flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]){
                System.out.println("找到了,位置在：第"+(i+1)+"个");
                Flag=false;
                break;
            }
        }
        if(Flag){
            System.out.println("没有找到");
        }

        //冒泡排序从小到大，二分法查找是有序的
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //二分法查找
        int c=-3;//查找元素
                        //计算时第几个元素是第几个元素个数 ，脚标是脚标二者分开计算
                        //二者可以相互转换 第几个元素减去1就是他的脚标
        int head = 0;
        int end = arr.length - 1;
        boolean Flag1 = true;

        for (int i = 0; i < arr.length; i++) {
            int middle = (head + end) / 2;

            if(c == arr[middle]){
                System.out.println("找到了，位置在，第"+(i+1)+"个");
                Flag1=false;
                break;
            }else if (c > arr[middle]){
                head = middle + 1;
            }else {
                end = middle - 1;
            }
        }
        if (Flag1){
            System.out.println("没有找到");
        }


    }

}
