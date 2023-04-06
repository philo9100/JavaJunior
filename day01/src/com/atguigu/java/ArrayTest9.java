package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 使用简单数组
（1）在main()方法中声明array1和array2两个变量，都是int类型的数组
（2）使用大括号把array1初始化为8个素数：2，3，5，7，11，13，17，19
（3）显示array1的内容
（4）赋值array2变量等于array1。修改array2中的偶索引元素
 *      使其等于索引值（如array[0]=0,array[2]=2）
 *
 * 思考：array1与array2的关系?  array1和array2地址值相同，都指向了推空间的唯一的一个数组实体

 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:25
 */
public class ArrayTest9 {

    public static void main(String[] args) {

        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};

        //遍历显示array1中的每一个元素
        System.out.println("第一次打印array1");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

        //赋值array2变量等于array1
        array2 = array1;//对于引用数据类型来讲，赋值的是地址值

        //修改array2中偶索引的元素，使其等于索引值
        System.out.println("打印array2");
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0){
                array2[i] = i;
            }
            System.out.print(array2[i] + "\t");
        }
        System.out.println();

        //再次遍历打印array1，观察array1
        System.out.println("第二次打印array1");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();


    }

}
