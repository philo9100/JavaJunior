package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 创建Person类的对象，设置该对象的name、age和sex属性，调用study方法
 * 输出字符串"studying",调用showAge()方法，调用addAge()方法给对象的age
 * 属性值增加2岁
 * name: String
 * age: int
 * sex: int
 * +study(): void
 * +shoeAge(): void
 * +addAge(int i): int
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-10-7:35
 */

public class oopTest4 {
    //属性
    String name;
    int age;
    /*
    sex :1 表示男性
    sex :0 表示女性
     */
    int sex;

    //方法
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println("age" + age);
    }
    public int addAge(int i){
        age += i;
        return age;
    }

}
