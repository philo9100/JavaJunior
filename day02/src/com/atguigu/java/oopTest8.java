package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 *4.  对象数组题目
 * 定义类Student，包含三个属性：学号number(int)、年纪state(int)、成绩score(int)
 * 创建20个学生对象，学号为1到20，年纪和成绩都由随机数确定
 * 问题一：打印3年纪（state值为3）的学生信息
 * 问题二：使用冒泡排序法按照学生成绩排序，并遍历所有学生的信息
 *
 * 提示
 * 生成随机数Math.Random(),返回值类型为double
 * 四舍五入取整数：Math.round(double d)，返回值类型为long
 *
 *前一个测试的改进版
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-10-7:36
 */
public class oopTest8 {

    public static void main(String[] args) {

        Student1[] stus = new Student1[20];

        oopTest8 oop1 = new oopTest8();//调用类中的方法首先要在main方法中创建方法所在类的对象

        //遍历给学生数组创建对象
        oop1.creat(stus);

        //遍历学生信息
        oop1.print(stus);

        System.out.println("******************************************************");

        //问题一 查找年级
        oop1.searchState(stus, 3);

        System.out.println("******************************************************");

        //问题二 排序
        oop1.sort(stus);

        //遍历数组中的元素
        oop1.print(stus);

    }

    /**
     * 遍历数组Student1[]的方法
     * @param stus Student1[]的形参
     */
    public void print(Student1[] stus){
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }
    }

    /**
     * 查找Student1[]数组中指定年级的学生信息的方法
     * @param stus 要找的数组
     * @param state 要找的年级
     * @return 学生的信息
     */
//    public String searchState(Student1[] stus, int state){
//        for (int i = 0; i < stus.length; i++) {
//            if(state == stus[i].state){
//                return stus[i].info();
//            }
//        }
//        return null;
//    }
    public void searchState(Student1[] stus,int state) {
        for(int i=0;i<stus.length;i++) {
            if(stus[i].state==state) {
                System.out.println(stus[i].info());
            }
        }
    }

    /**
     * 给数组Student1[] 的元素排序的方法
     * @param stus
     */
    public void sort(Student1[] stus){//类,接口，数组可以作为引用数据类型  (Student1是一个类) 数组可以是引用数据类型的数组，即数组元素的数据类型为引用数据类型
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if(stus[j].score < stus[j + 1].score){
                    //交换的是数组元素，而不是元素的分数
                    Student1 temp=stus[j+1];
                    stus[j + 1]=stus[j];
                    stus[ j ] =  temp;
                }
            }
        }
    }

    /**
     * 遍历给数组创建对象的方法
     * @param stus
     */
    public void creat(Student1[] stus){
        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student1();

            stus[i].number = i + 1;

            stus[i].state = (int)(Math.random()*(6 - 1 + 1) + 1);

            stus[i].score = (int)(Math.random()*(100 - 0 + 1) + 0);
        }
    }


}

class Student1{

    int number;
    int state;
    int score;

    //显示学生信息的方法
    public String info() {
        return "学生学号："+number+"，学生年级："+state+"，学生成绩:"+score;
    }

}