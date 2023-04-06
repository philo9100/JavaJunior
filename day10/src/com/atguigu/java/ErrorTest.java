package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * Error:
 * Java虚拟机无法解决的严重问题。如：JVM系统内部错误、资源耗尽等严重情况。比如：StackOverflowError和OOM。
 *
 * 一般不编写针对性的代码进行处理。
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-26-8:05
 */
public class ErrorTest {

    public static void main(String[] args) {
        //1.栈溢出：java.lang.StackOverflowError
//		main(args);
        //2.堆溢出：java.lang.OutOfMemoryError
        Integer[] arr = new Integer[1024*1024*1024];

    }

}
