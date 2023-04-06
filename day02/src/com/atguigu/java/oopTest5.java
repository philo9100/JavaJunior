package com.atguigu.java;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-10-7:35
 */
public class oopTest5 {

    public static void main(String[] args) {

        oopTest4 p1 = new oopTest4();

        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();

        p1.showAge();//按住ctrl 鼠标点击方法名，就会去到类中的该方法，ctrl+o就可以查找类中都有哪些方法
                     //在类中的该方法中按住Alt+左键就会回来

        //p1.addAge(2);//方法是返回了一个int 类型的数值
        int newAge = p1.addAge(2);
        System.out.println(p1.name + "的新年龄是：" + newAge);

        System.out.println(p1.age); //20

        System.out.println("*******************************");

        oopTest4 p2 = new oopTest4();//在栈空间中又声明了一个新的对象名为p2
                                 //在堆空间中又为该对象开辟了一个新的空间

        p2.showAge();//没有赋值，此时默认初始化值为0
        p2.addAge(10);
        p2.showAge();//10

        p1.showAge();//还是20，p1与p2没有关系

    }

}
