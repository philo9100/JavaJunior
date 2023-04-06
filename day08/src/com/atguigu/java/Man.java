package com.atguigu.java;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-19-16:46
 */
public class Man extends Person{

    public Man(String name, int age){
        super(name, age);
    }

    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk(){
        System.out.println("男人霸气的走路");
    }

}
