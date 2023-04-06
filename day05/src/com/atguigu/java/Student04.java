package com.atguigu.java;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-14-13:12
 */
public class Student04 extends Person03 {

    //子类中重复的结构根据继承性可以省略，减少代码冗余
//    String name;
//    int age;
    String major;

    public Student04(){

    }

    public Student04(String name, int age, String major){
        this.name = name;
//        this.age = age;
//        'age' has private access in 'com.atguigu.java.Person03'
//        获取了父类中私有的结构因为封装性的影响使得子类不能直接调用父类的结构
        setAge(age); //通过父类的set方法设置年龄
        this.major = major;
    }

    //子类中重复的结构根据继承性可以省略，减少代码冗余
//    public void eat(){
//        System.out.println("吃饭");
//    }
//
//    public void sleep() {
//		System.out.println("睡觉");
//	}

    public void study() {
        System.out.println("学习");
    }

    public void show() {
        System.out.println("name :" + name + ", age :" + getAge());
    }

}
