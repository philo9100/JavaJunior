package com.atguigu.exer;

/**
 * @author philo
 * @Description
 *
 *  考察多态的笔试题目
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-17-16:24
 */
public class InterviewTest1 {

    public static void main(String[] args) {

        Base1 base = new Sub1();//多态性
        base.add(1, 2, 3 );
        //多态性父类的引用指向子类的对象，通过父类的引用调用父类中的方法
        //执行时会优先调用子类中重写父类的该方法

        Sub1 s = (Sub1)base;//向下转型就是子类对象 可以调用子类中特有的符合形参的方法
        s.add(1, 2, 3); //此方法形参确定 则优先调用确定形参的方法

    }

}

class Base1{
    public void add(int a, int ... arr){
        System.out.println("base1");
    }
}

class Sub1 extends Base1{

    //多态性的使用优先调用子类中重写父类的方法
    public void add(int a , int[] arr) {
        System.out.println("Sub_1");
    }

    //此方法并没有重写父类的方法
    public void add(int a , int b , int c) {
        System.out.println("Sub_2");
    }

}

