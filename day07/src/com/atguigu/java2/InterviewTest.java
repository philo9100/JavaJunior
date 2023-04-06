package com.atguigu.java2;

import org.junit.Test;

/**
 * @author philo
 * @Description
 *
 * 关于包装类使用的面试题
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-17-12:36
 */
public class InterviewTest {

    @Test
    public void test1(){
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1); //1.0 三元运算符编译时就自动进行类型提升了
    }

    @Test
    public void test2(){
        Object o2;
        if(true){
            o2 = new Integer(1);
        }else{
            o2 = new Double(2.0);
        }
        System.out.println(o2); //1
    }

    @Test
    public void test3(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//比较的是地址值 false

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false

        //Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[]
        //保存了从-128 ~ 127范围的整数，如果我们使用自动装箱的方式，给Integer赋值的范围在
        //-128 ~ 127范围内时，可以直接使用数组中的元素，不用再去new了，目的，提高效率

    }

}
