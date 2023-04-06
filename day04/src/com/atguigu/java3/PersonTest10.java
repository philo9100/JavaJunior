package com.atguigu.java3;

/**
 * @author philo
 * @Description
 *
 * this关键字的使用
 *
 * 1. this可以用来修饰、调用：属性、方法、构造器
 *
 * 2. this修饰属性和方法
 *   this理解为: 当前对象 或 当前正在创建的对象（构造器）
 *
 *
 *  2.1 在类的 方法 中，我们可以使用 "this.属性" 或 "this.方法" 的方式，调用当前对象属性或方法。但是，
 *   	通常情况下，我们都选择省略 "this." 。特殊情况下，如果 方法 的形参和类的属性同名的话，我们必须显式
 *   	的使用 " this.变量 " 的方式，表明此变量是属性，而非形参。
 *
 *  2.2 在类的 构造器 中，我们可以使用 "this.属性" 或 "this.方法" 的方式，调用当前正在创建的对象属性或方法。
 *  	但是，通常情况下，我们都选择省略 "this." 。特殊情况下，如果 构造器 的形参和类的属性同名的话，我们必须显式
 *   	的使用 " this.变量 " 的方式，表明此变量是属性，而非形参。
 *
 *
 *   总结就是一旦形参名与属性名相同时用 "this." 来区分 , 或者方法或构造器中调用方法时强调的是当前对象的
 *        或当前正在创建的对象的方法。
 *
 * 3. this调用构造器
 * 		① 我们在类的构造器中，可以显式的使用 "this(形参列表)" 方式，调用本类中指定的其他构造器
 *
 * 		② 构造器中不能通过 "this(形参列表)" 方式调用自己
 *
 * 		③ 如果一个类中有n个构造器，则最多有(n - 1)个构造器中使用了 "this(形参列表)"
 *
 * 		④ 规定: "this(形参列表)" 必须声明在当前构造器的首行 Constructor call must be the first statement in a constructor
 *
 * 		⑤ 构造器内部，最多只能声明一个 "this(形参列表)" ，用来调用 其他的 构造器
 *
 * 		在造一个类的时候，提供多个重载的构造器时，一个构造器内部的逻辑与令一个构造器内部的逻辑相同，就可以使用this(形参列表)
 * 		调用有相同逻辑的构造器
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-11:43
 */
public class PersonTest10 {

    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setAge(1);
        System.out.println(p1.getAge());

        p1.eat();


        System.out.println("\n");


        Person p2 = new Person("Jerry" , 20);
        System.out.println(p2.getAge());



    }

}

class Person{

    private String name;
    private int age;


    public Person(){
        this.eat();//eat(); 如果不用区别形参与属性或者明确是对象在调用结构时可以省略this

        //this调用构造器的情况,例如
        //Person初始化时，需要考虑如下的1 , 2 , 3 , 4...(共40行代码)
        String info = "Person初始化时，需要考虑如下的1 , 2 , 3 , 4...(共40行代码)";
        System.out.println(info);
    }

    public Person(String name){
        //Person初始化时，需要考虑如下的1 , 2 , 3 , 4...(共40行代码)
        this(); //减少代码冗余 调用已有构造器完成的重复代码
        this.name = name;//需要区别形参与属性时就要用到this
    }

    public Person(int age){
        //Person初始化时，需要考虑如下的1 , 2 , 3 , 4...(共40行代码)
        this();//减少代码冗余
        this.age = age;
    }

    public Person(String name ,int age) {
        //Person初始化时，需要考虑如下的1 , 2 , 3 , 4...(共40行代码)
        this(age); //减少代码冗余
        this.name = name;
//		this.age = age; //该构造器的形参age赋给了调用的构造器的形参age，调用的构造器有this.age = age;
    }


    //因为标识符要求见名知意，此时形参的作用就是要给对象的属性赋值，所以形参名与对应的属性名相同
    //为了区别形参与属性，就使用一个this关键字。this.理解为 当前对象的
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name; //this.name; 不用区别形参与属性明确是当前对象在调用
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age; //this.age; 不用区别形参与属性明确是当前对象在调用
    }


    public void eat() {
        System.out.println("人吃饭");
        study(); //this.Study(); 不用区别形参与属性明确是当前对象在调用
    }

    public void study() {
        System.out.println("人学习");
    }

}




