package com.atguigu.java3;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-17-9:08
 */
public class Student extends Person{

    String major;
    int id = 1002;//学号 子类中与父类中有同名的属性，但在内存中是两个不同的id

    public Student(){
        //默认调用了super();
    }

    public Student(String major){
        this.major = major;
    }

    public Student(String name, int age, String major){
//        this.name = name;
//        this.age = age;
        super(name, age);//通过super调用父类的构造器
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生，多吃有营养的食物");
    }

    public void study(){
        System.out.println("学生，学习知识");
        eat();//调用的是this.eat() 重写后的方法
        super.eat();//通过super表示调用的父类的方法
    }

    public void show() {
        System.out.println("name :" + this.name + ", age :" + super.age);
        System.out.println("id :" + id);//此时的id调用的是子类的id，表示当前类的对象的id属性 省略了this.
        System.out.println("id :" + super.id);//用super.区分子父类中的id
    }


}
