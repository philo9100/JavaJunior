package com.atguigu.java3;

/**
 * @author philo
 * @Description
 *
 * final:最终的
 *
 * 1. final可以用来修饰的结构：类、方法、变量
 *
 * 2. final 用来修饰一个类:此类不能被其他类所继承。
 *          比如：String类、System类、StringBuffer类
 *
 * 3. final 用来修饰方法：表明此方法不可以被重写
 * 			比如：Object类中getClass();
 *
 * 4. final 用来修饰变量：此时的"变量"就称为是一个常量
 * 	    4.1 final修饰属性：可以考虑赋值的位置有：显式初始化、代码块中初始化、构造器中初始化
 * 		4.2 final修饰局部变量：
 *           尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋一个实参。一旦赋值
 *           以后，就只能在方法体内使用此形参，但不能进行重新赋值。
 *
 *  static final 用来修饰属性：全局常量
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-21-13:21
 */
public class FinalTest {

    final int WIDTH = 0;
    final int LEFT;//在代码块中赋值
    final int RIGHT;//在构造器中赋值
//    final int DOWN;

    {
        LEFT = 1;
    }

    public FinalTest(){
        RIGHT = 2;
    }

    public FinalTest(int n){
        RIGHT = n;
    }

//    public void setDown(int down){
//        this.DOWN = down;//Cannot assign a value to final variable 'DOWN'
//    }
    //不能在方法中赋值，构造器是对象创建的最后一步，final修饰的成员属性必须随着对象创建完成之前被赋值 (没有默认初始化值)
    //The final field FinalTest.DOWN cannot be assigned


    public void doWidth(){
//        WIDTH = 20;
//      Cannot assign a value to final variable 'WIDTH'
    }


    public void show(){
        final int NUM = 10;//常量
//        NUM += 20;
        //The final local variable NUM cannot be assigned.
        //It must be blank and not using a compound assignment
    }

    public void show(final int num){
//        num = 20;//编译不通过
        //只有在被调用的时候才可以赋值
        //The final local variable num cannot be assigned.
        //It must be blank and not using a compound assignment
        System.out.println(num);
    }



    public static void main(String[] args) {

        int num = 10;
        num += 5;

        FinalTest test = new FinalTest();
//        test.setDown(3);
//final修饰的成员属性必须随着对象创建完成之前被赋值 (没有默认初始化值)

        test.show(10);//final 修饰的形参 传入的实参为最终的不能再方法体内重新被赋值


    }

}


final class FinalA{

}

//class B extends FinalA{
//
//}
//The type B cannot subclass the final class FinalA

//class C extends String{
//
//}
//The type C cannot subclass the final class String

class AA{
    public final void show(){}
}

class BB extends AA{

//	public void show(){}
    //	 overrides com.atguigu.java3.AA.show
    //	-Cannot override the final method
    //	 from AA
}





