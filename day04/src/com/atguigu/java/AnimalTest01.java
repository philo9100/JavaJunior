package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 面向对象的特征一：封装与隐藏
 * 一、问题的引入
 * 		当我们创建一个类的对象以后，我么可以通过" 对象.属性 "的方式，对对象的属性进行赋值。这里，赋值操作要受到
 * 		属性的数据类型和存储范围的制约。除此之外，没有其他制约条件。但是，在实际问题中，我们往往需要给属性赋值
 * 		加入额外的限制条件。这个条件就不能在属性声明时体现，我们只能通过方法进行限制条件的添加
 * 		同时，我么需要避免用户再使用" 对象.属性 "的方式对属性进行赋值，则需要将属性声明为私有的（private）
 * 		——————>此时，针对于属性就体现了封装性（隐藏）
 *
 * 二、封装性的体现：
 * 我们将类的属性xxx私有化（private），同时，提供公共的（public）方法来获取（getXxx）和设置（setXxx）此属性的值
 *
 * 	拓展：
 * 		封装性的体现：①如上 ②不对外暴露的私有的方法 只对类内部的方法可调用 ③单例模式 。。。
 *
 * 三、封装性的体现，需要权限修饰符来配合
 * 	1、Java规定的4种权限（从小到大排），private、缺省(default)、protected、public
 *  2、4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 *  3、具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 *  		修饰类的话，只能使用，缺省(default)、public
 *
 * 总结封装性：Java提供了4种权限修饰来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性的大小
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-8:30
 */
public class AnimalTest01 {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.name = "大黄";
//        a.age = 1;//'age' has private access in 'com.atguigu.java.Animal'
//        a.legs = 4;//'legs' has private access in 'com.atguigu.java.Animal'

        a.show();

        //a.legs = -4; //The field Animal.legs is not visible
//	    a.setLegs(6);
        a.setLegs(-6);

        a.show();
        //运行正常。但实际情况中legs不可能是个负数
        //限制legs在赋值时的操作，就牵扯要用到分支结构
        //既然用到分支结构就涉及到设计类的方法
        //在该属性所在的类中，写一个限制该属性赋值的方法
        //首先方法要满足用户不能直接调用 .legs 属性，否则用户依然可以直接调用 .legs 属性赋值负数
        //其次方法要满足赋值的合理情况，就要用到分支结构限制 legs 的赋值

    }


}


class Animal{

    String name;
    private int age;
    private int legs;//腿的个数

    /**
     * 使合理性赋值 legs 的方法，方法体为分支结构用来限制legs的赋值
     * @param l
     */
    public void setLegs(int l){
        if(l > 0 && l % 2 == 0){
            legs = l;
        }else{
            legs = 0;//设置有误，默认用0代替
                     //或者后面会讲到抛出一个异常
        }
    }

    /**
     *由于 legs 属性被私有化（隐藏）没法被用户调用set方法赋值后使用
     *就写一个方法使得用户可以调用legs的属性
     * @return
     */
    public int getLegs(){
        return legs;
    }

    //提供关于属性age的get和set方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("动物进食");
    }

    public void show(){
        System.out.println("name =" + name + ",age = " + age + ",legs = " + legs);
    }

}