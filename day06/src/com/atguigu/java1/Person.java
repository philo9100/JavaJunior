package com.atguigu.java1;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-14-20:15
 */
public class Person {

    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void walk(int distance){
        System.out.println("走路，走的距离的是：" + distance + "公里");
        show(); //在测试类中打印的是父类的show()方法而不是子类重写的show()方法
                //说明权限是private的方法确实没有被子类重写
        eat(); //在测试类中打印的是子类重写的eat()方法而不再是父类被重写的eat()方法
               //说明子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符的方法确实被子类重写
    }

    private void show(){
        System.out.println("我是一个人");
    }

    public Object info(){
        return null;
    }

    public double info1(){
        return 1.0;
    }


}
