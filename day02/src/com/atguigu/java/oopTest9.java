package com.atguigu.java;

import java.util.Scanner;

/**
 * @author philo
 * @Description
 *
 * 声明一个日期类型dates：有属性：名字name ，年year ，月 month ，日 day。
 * 创建10个日期对象，分别赋值为：你的出生日期，你对象的出生日期，并显示信息
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-10-11:54
 */
public class oopTest9 {

    public static void main(String[] args) {

        oopTest9 oop = new oopTest9();

//        dates d1 = new dates( "philo", 1999, 9, 10);
//        dates d2 = new dates( "bob", 2002, 6, 6);
//        dates d3 = new dates( "jack", 2004, 6, 7);
//        dates d4 = new dates( "neo", 1998, 7, 5);
//        dates d5 = new dates( "coco", 1999, 5, 6);
        dates[] dates = new dates[]{
                new dates( "philo", 1999, 9, 10),
                new dates( "bob", 2002, 6, 6),
                new dates( "jack", 2004, 6, 7),
                new dates( "neo", 1998, 7, 5),
                new dates( "coco", 1999, 5, 6)
        };

        //创建数组对象
//        oop.creat(dates);

        //打印数组信息
        oop.print(dates);

        //查找年份
        oop.searchYear(dates, 2099);
    }


    /**
     * 添加数组对象
     * @param dates
     */
//    public void creat(dates[] dates){
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < dates.length; i++) {
//            dates[i] = new dates();
//            System.out.println("请输入姓名：");
//            dates[i].name = sc.next();
//            System.out.println("请输入年：");
//            dates[i].year = sc.nextInt();
//            System.out.println("请输入月：");
//            dates[i].month = sc.nextInt();
//            System.out.println("请输入日：");
//            dates[i].day = sc.nextInt();
//        }
//    }

    /**
     * 打印数组信息
     * @param dates
     */
    public void print(dates[] dates){
        for (int i = 0; i < dates.length; i++) {
            System.out.println(dates[i].info());
        }
    }

    /**
     * 查找指定年的信息
     * @param dates
     * @param year
     */
    public void searchYear(dates[] dates, int year){
        boolean flag = true;
        for (int i = 0; i < dates.length; i++) {
            if(year == dates[i].year){
                System.out.println(dates[i].info());
                flag = false;
            }
        }
        if(flag){
            System.out.println("没有找到");
        }
    }

}

class dates{
    //属性
    String name;
    int year, month, day;

    public dates(String name, int year, int month, int day) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //
    public String info(){
        return "Name:" + name + ",brithday:" + year + "," + month + "," + day;
    }

}