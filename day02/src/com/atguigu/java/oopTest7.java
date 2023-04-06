package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 *   4.  对象数组题目
 * 定义类Student，包含三个属性：学号number(int)、年纪state(int)、成绩score(int)
 * 创建20个学生对象，学号为1到20，年纪和成绩都由随机数确定
 * 问题一：打印3年级（state值为3）的学生信息
 * 问题二：使用冒泡排序法按照学生成绩排序，并遍历所有学生的信息
 *
 * 提示
 * 生成随机数Math.Random(),返回值类型为double
 * 四舍五入取整数：Math.round(double d)，返回值类型为long
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-10-7:36
 */
public class oopTest7 {

    public static void main(String[] args) {
        //创建20个对象一个一个new太慢 既然满足同样的属性可以考虑使用数组//		Student s1=new Student();
//		Student s2=new Student();
//		Student s3=new Student();
//		Student s4=new Student();
//		Student s5=new Student();
//		         .
//		         .
//		         .

        //声明一个Student类型的数组，类在实例化对象的过程中，实例的对象数目较多时可以创建一个该类的数组(因为类本身可以作为引用数据类型)，即创建一个
        //数组元素为引用数据类型的引用数据类型数组，类实例化的对象就相当于数组中的元素
        Student[] stus = new Student[20];//动态初始化
                                         //类似String类型的数组 String也是一个类
                                         //String[] arr = new String[];
                                         //我们创建的Student也是一个类,类作为引用数据类型创建数组
        for (int i = 0; i < stus.length; i++) {
            //给数组元素赋值
            stus[i] = new Student();
            //给Student类的对象的属性赋值
            stus[i].number = (i + 1);
            //年纪：[1,6]
            stus[i].state = (int)(Math.random()*(6 - 1 + 1) + 1);
            //成绩：[0,100]
            stus[i].score = (int)(Math.random()*(100-0+1)+0);
        }

        //遍历学生数组
        //方法一、
//        for (int i = 0; i < stus.length; i++) {
//            System.out.println("学生学号为：" + stus[i].number +
//                        "，学生年级为：" + stus[i].state +
//                    "，学生是成绩为：" + stus[i].score);
//        }
        System.out.println("******************************************");
        //方法二、
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }

        System.out.println("******************************************");
        //问题一、打印3年级（state的值为3）的学生信息
        for (int i = 0; i < stus.length; i++) {
            if(stus[i].state == 3){
                System.out.println(stus[i].info());
            }
        }

        System.out.println("******************************************");
        //问题二、使用冒泡排序法按照学生的成绩排序，并遍历所有学生的信息
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if(stus[j].score < stus[j + 1].score){
                    //交换顺序，交换的是数组的元素即对象！！，而不是交换数组元素的分数
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
        //遍历学生信息
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }

    }

}


class Student{

    int number;//学号
    int state;//年级
    int score;//成绩

    //显示学生信息的方法
    public String info(){
        return "学号：" + number + "，年级" + state + "，成绩" + score;
    }

}