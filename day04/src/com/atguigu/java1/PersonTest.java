package com.atguigu.java1;

/**
 * @author philo
 * @Description
 *
 * 类的结构之三：构造器（或构造方法、constructor）的使用
 *
 * 一、构造器的使用：
 *  1.创建对象
 *  2.初始化对象的信息（对于类的每一个对象共有的属性或行为，在创建对象的同时就给其赋值
 *  				   不用再通过对象.属性或者对象.方法在赋值了。通常初始化的是属性）
 *
 * 二、说明：
 * 	1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 *
 *  2.定义构造器的格式：权限修饰符 类名（构造器名与类名相同）(形参列表){}
 *
 *  3.一个类中定义的多个构造器，彼此构成重载
 *
 *  4.一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器
 *
 *  5.一个类中，至少会有一个构造器
 *
 *
 *  构造器是构造器 ，方法是方法
 *  方式可以看成是封装在类中的功能，通过对象去调用该功能
 *  而构造器就是去造对象的
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-10:59
 */
public class PersonTest {

    public static void main(String[] args) {

        //创建类的对象： new + 构造器
        Person p = new Person(); //ctrl + 鼠标左键 点击Person() 自动跳转到Person类中对应的构造器
        //运行后 打印出构造器中的方法，说明 Person() 就是构造器
        p.eat();

        Person p1 = new Person("Tom");
        System.out.println(p1.name);

    }

}


class Person{

    //属性
    String name;
    int age;


    //构造器
    public Person() {
        System.out.println("Person().....");
    }

    public Person(String n) {
        name = n;
    }

    public Person(String n,int a) {
        name = n;
        age = a;
    }


    //方法
    public void eat() {
        System.out.println("人吃饭");
    }

    public void study() {
        System.out.println("人可以学习");
    }

}
