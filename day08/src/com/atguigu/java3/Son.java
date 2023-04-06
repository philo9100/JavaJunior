package com.atguigu.java3;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-21-13:22
 */
class Father {
    static {
        System.out.println("11111111111");
    }
    {
        System.out.println("22222222222");
    }

    public Father() {
        System.out.println("33333333333");

    }

}

public class Son extends Father {
    static {
        System.out.println("44444444444");
    }
    {
        System.out.println("55555555555");
    }
    public Son() {
        System.out.println("66666666666");
    }


    public static void main(String[] args) { // 由父及子 静态先行  main方法作为程序的入口但是也是普通的静态方法，随着类的加载会先执行类中的静态代码块
        System.out.println("77777777777");
        System.out.println("************************");
        new Son();
        System.out.println("************************");
        new Son();
        System.out.println("************************");
        new Father();
    }

}
