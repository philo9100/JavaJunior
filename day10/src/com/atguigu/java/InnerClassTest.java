package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-26-8:05
 */
public class InnerClassTest {

    //	public void onCreate(){
//
//		int number = 10;
//
//		View.OnClickListern listener = new View.OnClickListener(){
//
//			public void onClick(){
//				System.out.println("hello!");
//				System.out.println(number);
//			}
//
//		}
//
//		button.setOnClickListener(listener);
//
//	}


    /*
     * 在局部内部类的方法中（比如：show）如果调用局部内部类所声明的方法(比如：method)中的局部变量(比如：num)的话,
     * 要求此局部变量声明为final的。
     *
     * jdk 7及之前版本：要求此局部变量显式的声明为final的
     * jdk 8及之后的版本：可以省略final的声明
     *
     */
    public void method(){
        //局部变量
        int num = 10;

        class AA{


            public void show(){
//				num = 20;
//              Variable 'num' is accessed from within inner class, needs to be final or effectively final
//              Local variable num defined in an enclosing scope must be final or effectively final
                System.out.println(num);

            }


        }


    }


}
