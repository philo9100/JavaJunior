package com.atguigu.java;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-14-13:08
 */
public class Person03 extends Creature02 {

    String name;
    private int age;

    public Person03(){

    }

    public Person03(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
        sleep();//私有的方法在内部类中调用
    }

    private void sleep(){
        System.out.println("睡觉");
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
