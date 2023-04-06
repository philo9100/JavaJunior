package com.atguigu.java3;

/**
 * @author philo
 * @Description
 *
 * JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-25-16:13
 */
public interface CompareA {

    //静态方法 可以并只能通过接口之接调用
    public static void method1(){
        System.out.println("CompareA:北京");
    }

    //默认方法 通过接口实现类的对象调用
    public default void method2(){
        System.out.println("CompareA：上海");
    }
    //省略了权限修饰符public 但默认权限还是public
    default void method3(){
        System.out.println("CompareA：上海");
    }

}
