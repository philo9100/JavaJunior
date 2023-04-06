package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 在PersonTest类中实例化Person类的对象b
 * 调用setAge()和getAge()方法，体会Java的封装性
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-9:49
 */
public class PersonTest05 {

    public static void main(String[] args) {

        Person04 p1 = new Person04();
        System.out.println("年龄为：" + p1.getAge() );//18

//		p1.age = 1;//The field Person04.age is not visible
        //'age' has private access in 'com.atguigu.java.Person04'

        p1.setAge(12); //注释掉setAge(12)才能看到构造器里的年龄值18
        System.out.println("年龄为：" + p1.getAge() );//12


        Person04 p2 = new Person04( "Tom" , 21);
        System.out.println("name = " + p2.getName() + " , age = " + p2.getAge());

    }


}
