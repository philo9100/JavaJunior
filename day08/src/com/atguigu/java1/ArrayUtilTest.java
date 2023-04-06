package com.atguigu.java1;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-21-11:18
 */
public class ArrayUtilTest {

    public static void main(String[] args) {

//		ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32, 34, 32, 5, 3, 54, 654, -98, 0, -53, 5};
        int max = ArrayUtil.getMax(arr);
        System.out.println("最大值为：" + max);

        System.out.println("排序前：");
        ArrayUtil.print(arr);

        ArrayUtil.sort(arr);
        System.out.println("排序后：");
        ArrayUtil.print(arr);

        int index = ArrayUtil.getInfo(arr, -5);
        System.out.println("查找：");
		if(index >= 0){
			System.out.println("找到了，索引地址为：" + index);
		}else{
			System.out.println("未找到");
		}

		ArrayUtil.reverse(arr);
		ArrayUtil.print(arr);


    }

}
