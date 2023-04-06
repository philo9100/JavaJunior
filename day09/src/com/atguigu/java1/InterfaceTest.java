package com.atguigu.java1;

/**
 * @author philo
 * @Description
 *
 * 接口的使用
 * 1.接口使用interface来定义
 * 2.Java中，接口和类是并列的两个结构
 * 3.如何定义接口：定义接口中的成员
 *
 * 		3.1 JDK7及以前：只能定义全局常量和抽象方法
 * 			>全局常量：public static final的.但是书写时，可以省略不写
 * 			>抽象方法：public abstract的
 *
 * 		3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法（略）
 *
 * 4. 接口中不能定义构造器的！意味着接口不可以实例化
 *
 * 5. Java开发中，接口通过让类去实现(implements)的方式来使用.
 *    如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 *    如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类
 *
 * 6. Java类可以实现多个接口   --->弥补了Java单继承性的局限性
 *   格式：class AA extends BB implements CC,DD,EE
 *
 * 7. 接口与接口之间可以继承，而且可以多继承
 *
 * *******************************
 * 8. 接口的具体使用，体现多态性
 * 9. 接口，实际上可以看做是一种规范
 *
 * 面试题：抽象类与接口有哪些异同？
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-22-11:21
 */
public class InterfaceTest {
}

interface Flyable{

    //全局变量
    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;//省略了public static final

    //抽象方法
    public abstract void fly();
    void stop();//省略了public abstract

    //接口不可以有构造器
    //Interfaces cannot have constructors
//	public Flyable(){}

}


interface Attackable{

    void attack();//省略了public abstract

}

class Plane implements Flyable{
    //接口的抽象方法叫类实现（覆盖）了接口的方法，而不叫重写（本质上是重写）
    @Override
    public void fly(){
        System.out.println("通过引擎起飞");
    }
    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

//该实现类没有实现（覆盖）接口的全部抽象方法，则该类只能是一个抽象类
abstract class Kite implements Flyable{
    @Override
    public void fly() {}
}

//Class 'Bullet' must either be declared abstract or implement abstract method
// 'fly()' in 'Flyable', 'stop()' in 'Flyable'
// 'attack()' in 'Attackable'
// 'method1()' in 'AA', 'method2()' in 'BB'
class Bullet extends Object implements Flyable,Attackable,CC{
    @Override
    public void fly() {}
    @Override
    public void stop() {}
    @Override
    public void attack() {}
    @Override
    public void method1() {}
    @Override
    public void method2() {}
}

//************* 接口与接口之间可以继承，而且可以多继承 ***********************************
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA, BB{

}

