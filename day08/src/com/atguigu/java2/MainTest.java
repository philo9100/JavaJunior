package com.atguigu.java2;

/**
 * @author philo
 * @Description
 *
 * main()方法的使用说明：
 * 1. main()方法作为程序的入口
 * 2. main()方法也是一个普通的静态方法
 * 3. main()方法可以作为我们与控制台交互的方式。（之前：使用Scanner）
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-21-11:56
 */
public class MainTest {

    public static void main(String[] args) { //入口
        //main()方法也是一个普通的静态方法，静态方法内部只能调用静态结构
        //非静态结构只能通过对象调用
        Main.main(new String[100]); //匿名方法

        MainTest test = new MainTest();
        test.show();

    }

    public void show(){}

}

class Main{

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
        
    }

}