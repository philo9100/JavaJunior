package com.atguigu.java2_exer;

/**
 * @author philo
 * @Description
 *
 * 1.定义Student类，有4个属性
 *   String name;
 *   int age;
 *   String school;
 *   String major;
 * 2.定义Student类的3个构造器:
 *   >第一个构造器Student(String n , int a)设置类的name和age属性;
 *
 *   >第二个构造器Student(String n , int a , String s)设置类的name , age和school属性
 *
 *   >第三个构造器Student(String n , int a , String s , String m)设置类的name , age , school和major属性
 *
 * 3.在main方法中分别调用不同的构造器创建的对象，并输出其属性值。
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-11:29
 */
public class StudentTest {

    public static void main(String[] args) {

        Student s1 = new Student("Tom" , 15);
        System.out.println("name :" + s1.name + " , age :" + s1.getAge());

        Student s2 = new Student("Tim" , 16 , "实验中学" , "3");
        System.out.println("name :" + s2.name + " , age :" + s2.getAge() + " , school :" + s2.school + " , 年级 :" + s2.major);

    }

}


class Student{

    //属性
    String name;
    private int age;
    String school;
    String major;

    //构造器
    public Student(){}

    public Student(String n, int a){
        name = n;
        age = a;
    }

    public Student(String n, int a, String s){
        name = n;
        age = a;
        school = s;
    }

    public Student(String n ,int a ,String s ,String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }

    //方法
    public void setAge(int a){
        if(a < 0 || a > 130){
            System.out.println("年龄设置有误！");
            return;
        }age = a;
    }

    public int getAge(){
        return age;
    }

}