package com.atguigu.java1;

/**
 * @author philo
 * @Description 自定义工具类的测试类
 * @email 3424586889@qq.com
 * @Date 2021-09-11-15:51
 */
public class ArrayUtilTest03 {

    public static void main(String[] args) {

        ArrayUtil02 util = new ArrayUtil02();

        int[] arr = new int[]{32, 34, 32, 5, 3, 54, 654, -98, 0, -53, 5};

//		System.out.println("排序前：");
//		util.print(arr);
//		System.out.println();
		util.sort(arr);
		System.out.println("排序后：");
		util.print(arr);

        System.out.println("查找:");
//        int index = util.getIndex(arr, 5);//对于有返回值的方法，调用方法后可以在;前 快捷键ctrl + 1 用返回值类型的变量接收
//        if (index >= 0) {
//            System.out.println("找到了，索引地址为：" + index);
//        } else {
//            System.out.println("未找到");
//        }
//
//        int[] index = util.getIndex(arr, 5);
//        System.out.println("索引值为");
//        util.print(index);
//        System.out.println(arr[10]);

        int index2 = util.getIndex2(arr, 5);
        System.out.println(index2);
    }

}