package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * abstract关键字的使用
 * 1.abstract:抽象的
 * 2.abstract可以用来修饰的结构：类、方法
 *
 * 3. abstract修饰类：抽象类
 * 		> 此类不能实例化
 *      > 抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
 *      > 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 *
 *
 * 4. abstract修饰方法：抽象方法
 * 		> 抽象方法只有方法的声明，没有方法体。没有{} 直接以 ; 结尾
 * 		> 包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
 *      > 若子类重写了父类中的所有的抽象方法后，此子类方可实例化
 *        若子类没有重写父类中的所有的抽象方法，则此子类也是一个抽象类，需要使用abstract修饰
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-21-20:49
 */
public class AbstractTest {

    public static void main(String[] args) {

        //一旦Person类抽象了，就不可实例化
//		Person p1 = new Person(); //'Person' is abstract; cannot be instantiated
//		p1.eat();

        Student stu = new Student();
        stu.walk();

    }

}


//abstract一定是伴随着继承性出现的，子类一定要能继承abstract修饰的方法并能重写后调用该方法
//private修饰的方法是不可以被重写的，所以abstract修饰的方法权限不能是private
abstract class Creature{
    public abstract void breath();
}

abstract class Person extends Creature{

    String name;
    int age;

    public Person(){
        super();
    }

    public Person(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    //不是抽象方法：
//    public void eat(){
//
//    }
    //抽象方法
    public abstract void eat();
//抽象方法不可被调用，包含抽象方法的的类一定是抽象类，保证类不会通过创建对象调用该抽象方法

    public void walk(){
        System.out.println("人走路");
    }

}

//Class 'Student' must either be declared abstract or implement abstract method 'eat()' in 'Person'
//Class 'Student' must either be declared abstract or implement abstract method 'breath()' in 'Creature'
class Student extends Person{

    public Student(String name, int age){
        super(name, age);
    }

    public Student(){

    }

    //父类的eat()方法抽象后被子类所继承，通过子类的对象去调用该继承的抽象方法显然是不对的
    //所以子类要重写父类抽象的方法，或者Student类也加上abstract
    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }

    //没有声明为抽象的子类要重写所有父类（直接父类、间接父类）中的抽象方法
    @Override
    public void breath(){
        System.out.println("学生应该呼吸新鲜的没有雾霾的空气");
    }

}
