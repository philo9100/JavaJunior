package com.atguigu.exer;

/**
 * @author philo
 * @Description
 *
 * 自定义异常类
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-26-10:21
 */
public class EcDef extends Exception{

    static final long serialVersionUID = -33875164229948L;

    public EcDef(){}

    public EcDef(String msg){
        super(msg);
    }

}
