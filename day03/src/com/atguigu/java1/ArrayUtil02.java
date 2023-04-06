package com.atguigu.java1;

/**
 * @author philo
 * @Description
 *
 * 自定义工具类
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-11-15:24
 */
public class ArrayUtil02 {

    //求数组的最大值
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    //求数组的最小值
    public int getMin(int[] arr) {
        int minValue = arr[0];
        for(int i = 1 ; i< arr.length ; i++) {
            if(minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    //求数组的总和
    public int getSum(int[] arr) {
        int sum = 0;
        for(int i = 0 ; i< arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //求数组的平均值
    public int getAvg(int[] arr) {
        return getSum(arr) / arr.length; //方法中调用方法
    }

    //数组反转
    public void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    //数组复制
    public int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    //数组排序
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //遍历数组
    public void print(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }
        }
        System.out.print("}");
    }

    //查找指定的元素
    public int[] getIndex(int[] arr , int dest) {
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(dest == arr[i]) {
                count++;
//                return i;
            }
        }
        int[] index = new int[count];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(dest == arr[i]) {
                index[sum++] = i;
            }
        }
        return index;//返回一个负数，表示没有找到
    }

    public int getIndex2(int[] arr, int dest){
        sort(arr);
        int head = 0;
        int end = arr.length - 1;
//        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            int middle = (head + end)/2;
            if(dest == arr[middle]){
//                System.out.print("找到了");
//                flag = false;
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
