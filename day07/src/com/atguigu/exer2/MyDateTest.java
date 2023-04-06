package com.atguigu.exer2;

import java.util.Objects;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-19-9:29
 */
public class MyDateTest {

    public static void main(String[] args) {

        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);

        //比较的是地址值
        if(m1 == m2){
            System.out.println("m1 == m2");
        }else{
            System.out.println("m1 != m2");
        }

        if(m1.equals(m2)){
            System.out.println("m1 is euals to m2");
        }else{
            System.out.println("m1 is not equals to m2");
        }

    }

}

class MyDate{

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //手写equals()
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof MyDate){
            MyDate mydate = (MyDate)obj;
            return this.day == mydate.day &&
                    this.month == mydate.month &&
                    this.year == mydate.year;
        }
        return false;
    }


    //自动生成的equals()
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MyDate myDate = (MyDate) o;
//        return day == myDate.day && month == myDate.month && year == myDate.year;
//    }

}
