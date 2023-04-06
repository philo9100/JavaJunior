package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 抽象类的应用：模板方法的设计模式
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-21-20:51
 */
public class TemplateTest {

    public static void main(String[] args) {

        SubTemplate t = new SubTemplate();

        t.spendTime();

    }

}

abstract class Template{

    //计算某段代码执行所需要花费的时间
    public void spendTime(){
        long start = System.currentTimeMillis();//获得代码执行到当前段距1970...的毫秒数

        this.code();//不确定的部分、易变的部分

        long end = System.currentTimeMillis();//获得代码执行到当前段距1970...的毫秒数

        System.out.println("花费的时间为：" + (end - start));//执行代码所花费的时间
    }

    //对于不确定的部分将其抽象，子类继承后重写其抽象方法将其具体化
    public abstract void code();

}

class SubTemplate extends Template{

    //重写父类的抽象方法。优先调用子类重写的方法
    @Override
    public void code(){
        //1000之内的质数
        for (int i = 2; i <= 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag) {
                System.out.println(i);
            }
        }
    }

}