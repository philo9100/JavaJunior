package com.atguigu.java;

import com.atguigu.java6_exer.Account;
import com.atguigu.java6_exer.Bank;
import com.atguigu.javason.Dog;

import java.lang.reflect.Field;//lang包子包下的结构需要显式导入

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Scanner;
//以上都来自同一个包，可以替换成下面
import java.util.*;

import static java.lang.System.*;
import static java.lang.Math.*;

/**
 * @author philo
 * @Description
 *
 * 一、package关键字的使用
 *
 * 1.为了更好的实现项目中类的管理，提供包的概念
 *
 * 2.使用package声明类或接口所属的包，声明在源文件的首行
 *
 * 3.包，属于标识符，遵循标识符的命名规则、规范(xxxyyyzzz)、"见名知意"
 *
 * 4.每 "." 一次，就代表一层文件目录。
 *
 *  补充：同一个包下，不能命名同名的接口、类
 * 		  不同的包下，可以命名同名的接口、类
 *
 *
 * 二、import关键字的使用
 * import：导入
 *
 * 1.在源文件中显式的使用import结构导入指定包下的类、接口  （落脚点是类或接口）
 *
 * 2.声明在 包的声明和类的声明之间
 *
 * 3.如果需要导入多个结构，则并列写出即可
 *
 * 4.可以使用 " xxx.* " 的方式表示可以导入 " xxx " 包下的所有结构
 *
 * 5.如果使用的类或接口是java.lang包下定义的，则可以省略import结构
 *
 * 6.如果使用的类或接口是本包下定义的，则可以省略import结构
 *
 * 7.如果在源文件中，使用了不同包下的同名的类，则必须至少有一个类需要使用全类名的方式显示
 *
 * 8.使用 "xxx.*" 方式表明可以调用xxx包下的所有结构。但是如果使用的是 xxx 子包下的结构，则仍需要显式导入
 *
 *
 * 9.import static : 导入指定类或接口中的静态结构 落脚点是(属性、方法)。
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-10:39
 */
public class PackageImport10 {

    public static void main(String[] args) {

        String info = Arrays.toString(new int[]{1, 2, 3});

        Bank bank = new Bank();

        ArrayList list = new ArrayList();

        HashMap map = new HashMap();

        Scanner s = null;

        Person04 p = new Person04();//同一个包下的类

        //对于不同的包下相同的类名，导用的时候只能使用全类名的的方式导入
        Account acct = new Account(1000);
        //全类名的方式显示
        com.atguigu.java5_exer.Account acct1 = new com.atguigu.java5_exer.Account(1000 , 2000 , 0.0123);

        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(554455425565566L);

        Dog dog = new Dog();

        //lang 包的子包下的结构 使用时需要显式导入
        Field field = null;

        /*
        import static : 导入指定类或接口中的静态结构 落脚点是(属性、方法)。
         */
        //System.out.println("hello");
        out.print("hello");

        //Math.round(123.434);
        round(123.434);


    }

}
