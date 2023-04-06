package com.atguigu.java5;

import java.util.Random;

/**
 * @author philo
 * @Description
 *
 * 虚拟方法调用（多态的情况下）
 * 子类重写父类的方法，在多态的情况下，将此时的父类的方法称为虚拟方法，父类根据赋给它的不同子类的对象，动态调用属于子类的该方法。
 * 这样的方法调用在编译期是无法确定的
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-17-11:25
 */

//多态是编译时行为还是运行时行为
//证明如下
class Animal {

    protected void eat() {
        System.out.println("animal eat food");
    }

}

class Cat extends Animal {

    protected void eat() {
        System.out.println("Cat eat fish");
    }
}

class Dog extends Animal {

    protected void eat() {
        System.out.println("Dog eat bone");
    }
}

class Sheep extends Animal {

    protected void eat() {
        System.out.println("sheep eat grass");
    }
}

public class InterviewTest {

    public static Animal getInstance(int key){
        switch(key){
            case 0:
                return new Cat();
            case 1:
                return new Dog();
            default:
                return new Sheep();
        }
    }

    public static void main(String[] args) {

        int key = new Random().nextInt(3);

        System.out.println(key);

        Animal animal = getInstance(key);

        animal.eat();//从编译期的角度看不出是谁在吃，只有运行时才知道是谁在吃
                     //所以可以看出多态性是运行时行为，而非编译时行为
    }

}
