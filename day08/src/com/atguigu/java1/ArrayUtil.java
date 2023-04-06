package com.atguigu.java1;

/**
 * @author philo
 * @Description
 *
 * 自定义数组的工具类
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-21-11:18
 */
public class ArrayUtil {

    // 求数组的最大值
    public static int getMax(int[] arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // 求数组的最小值
    public static int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    // 求数组的总和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 求数组的平均值
    public static double getAvg(int[] arr){
        return getSum(arr) / arr.length;
    }

    // 反转数组
    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // 复制数组
    public static int[] copy(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    // 数组排序
    public static void sort(int[] arr){
        // 冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
//                  int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
                    //错误的：
//					swap(arr[j],arr[j + 1]);
                    //正确的：
                    swap(arr,j,j + 1);
                }
            }
        }
    }

    //错误的：交换数组中指定两个位置元素的值
//	public void swap(int i, int j){
//		int temp = i;
//		i = j;
//		j = temp;
//	}
    //正确的：交换数组中指定两个位置元素的值
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 遍历数组
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    // 查找指定元素
    public static int getIndex(int[] arr, int dest) {
        // 线性查找：
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                return i;
            }
        }
        return -1;//返回一个负数，表示没有找到
    }

    public static int getInfo(int[] arr, int dest){
        //二分查找
        int head = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int middle = (head + end)/2;
            if(dest == arr[middle]){
                return middle;
            }else if(dest > arr[middle]){
                head = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        return -1;
    }



}
