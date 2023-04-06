package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * >>>>>抽象类的匿名子类
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-21-20:50
 */
public class PersonTest {

    public static void main(String[] args) {

        method(new Student());//匿名对象

        Worker worker = new Worker();
        method1(worker);//非匿名的类非匿名的对象

        method1(new Worker());//非匿名的类匿名的对象

        System.out.println("*********************************************");

        //创建了一个匿名子类的非匿名对象：p
        Person p = new Person() {
            //相当于多态性，此时子类没有名字用父类的名字暂时充当，子类还要重写父类中所有的抽象方法
            @Override
            public void eat() {
                System.out.println("吃东西");
            }

            @Override
            public void breath() {
                System.out.println("好好呼吸");
            }
        };

        method1(p);

        System.out.println("*********************************************");
        //创建匿名子类的匿名对象
        method1(new Person() {
            @Override
            public void eat() {
                System.out.println("吃好吃东西");
            }

            @Override
            public void breath() {
                System.out.println("好好呼吸新鲜空气");
            }
        });


    }


    public static void method1(Person p){
        p.eat();
        p.breath();
    }

    public static void method(Student s){

    }


}

class Worker extends Person{

    //重写所有父类的所有抽象方法
    @Override
    public void eat(){}

    @Override
    public void breath(){}
}







