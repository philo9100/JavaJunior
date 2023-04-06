package com.atguigu.java;

import java.util.Objects;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-19-16:46
 */
public class Person {

    String name;
    int age;

    public Person(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人：吃饭");
    }

    public void walk(){
        System.out.println("人：走路");
    }

    //自动
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    //手动
//        @Override
//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//        if(obj instanceof Person){
//            Person p = (Person) obj;
//            return this.name.equals(p.name) && this.age == p.age;
//        }
//        return false;
//    }

}
