package com.atguigu.java2;

/**
 * @author philo
 * @Description
 *
 * 如何自定义异常类？
 * 1. 继承于现有的异常结构：RuntimeException 、Exception
 * 2. 提供全局常量：serialVersionUID
 * 3. 提供重载的构造器
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-26-9:47
 */
public class MyException extends Exception{

    static final long serialVersionUID = -7034897193246939L;

    public MyException(){}

    public MyException(String msg){
        super(msg);
    }

}
