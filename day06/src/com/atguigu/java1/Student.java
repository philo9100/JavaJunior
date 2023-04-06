package com.atguigu.java1;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-14-20:16
 */
public class Student extends Person{

    String major;

    public Student(){

    }

    public Student(String major){
        this.major = major;
    }

    public void study() {
        System.out.println("学习，专业是：" + major);
    }

    //对父类中的eat()方法进行了重写
    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }

    public void show() {
        System.out.println("我是一个学生");
    } //方法前没有小圈 说明不是重写父类的方法，因为父类中该方法的权限太小说明不再认为
      //是重写父类的方法了
      //子类不能重写父类中声明为private权限的方法

    public String info(){
        return null;
    }

//    public int info1(){
//        return 1;
//    } //The return type is incompatible with Person.info1()


}
