package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * JavaBean是一种Java语言写成的可重用组件
 *
 *
 * 		所谓JavaBean：是指符合如下标准的Java类
 *			>类是公共的
 *			>有一个无参的公共的构造器
 *			>有属性，并且有对应的get、set方法
 *
 *
 * >>>>>默认提供的无参构造器的权限修饰与其类的权限修饰一致
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-10:27
 */
//这个Java类就相当于一个JavaBean，后面讲到Java反射时具体讲JavaBean的使用
public class Customer09 {

    //属性
    private int id;
    private String name;

    //构造器
    public Customer09(){}

    //方法
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }


}
