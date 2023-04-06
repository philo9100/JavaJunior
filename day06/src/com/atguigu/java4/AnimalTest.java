package com.atguigu.java4;

/**
 * @author philo
 * @Description
 *
 * 多态性的使用举例一、
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-17-10:46
 */
public class AnimalTest {

    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());

    }

    public void func(Animal animal){ //多态性的前提有继承，有重写
                                     //Animal animal = new Dog();
        animal.eat();
        animal.shout();

        //向下转型调用子类特有的方法
        if(animal instanceof Dog){
            Dog d = (Dog) animal;
            d.watchDoor();
        }
    }

    //如果没有多态性的方法,还需要再多写两个不同参同名的重载方法，代码显得冗余
//    public void func(Dog dog){
//        dog.eat();
//        dog.shout();
//    }
//    public void func(Cat cat){
//        cat.eat();
//        cat.shout();
//    }

}


class Animal{

    public void eat(){
        System.out.println("动物，进食");
    }

    public void shout(){
        System.out.println("动物，叫");
    }

}

class Dog extends Animal{

    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void shout(){
        System.out.println("汪！汪！汪");
    }

    public void watchDoor(){
        System.out.println("看门");
    }

}


class Cat extends Animal{

    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void shout(){
        System.out.println("喵！喵！喵");
    }

}
