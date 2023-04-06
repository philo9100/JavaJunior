package com.atguigu.exer;

/**
 * @author philo
 * @Description
 *
 * 定义一个Kids继承ManKind，并包括
 * 成员变量int yearsOld
 * 方法printAge()打印yearsOld的值
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-14-14:15
 */
public class Kids extends ManKind{

    private int yearsOld;

    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("I am " + yearsOld + "years old");
    }

    public int getYearsOld(){
        return yearsOld;
    }

    public void setYearsOld(int yearsOld){
        this.yearsOld = yearsOld;
    }

    /*
     * 在kids中重新定义employed()方法
     * 覆盖父类ManKind中定义的employed()方法
     */
    @Override
    public void employeed() {
        System.out.println("Kids should study and no job");
    }

}
