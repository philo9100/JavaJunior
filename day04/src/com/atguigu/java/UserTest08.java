package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 总结:属性赋值的先后问题
 *
 * 1.默认初始化
 * 2.显式初始化 (类中属性显式初始化，构造器中属性显式初始化)
 * 3.构造器初始化 （通过参数初始化）
 *
 * 4.通过"对象.方法" 或 "对象.属性" 赋值

 *
 * 以上操作的先后顺序:  1.——> 2. ——> 3. ——> 4.
 *
 * 前三个都可以看作是初始化，都可以通过第四个的修改来覆盖之前初始化的值
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-10:11
 */
public class UserTest08 {

    public static void main(String[] args) {

        User u = new User();

        System.out.println(u.name+","+u.age);


        User u1 = new User(2);

        u1.setAge(3);

        System.out.println(u1.age);

    }

}


class User{

    String name;//默认初始化
    int age = 1;//类中的属性显示初始化


    public User() {
        name = "philo";//构造器中的属性显示初始化
    }
    public User(int a) { //构造器初始化
        age = a;
    }

    //通过"对象.方法"
    public void setAge(int a) {
        age = a;
    }


}