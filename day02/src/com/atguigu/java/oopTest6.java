package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 3.1 编写一个程序，声明一个method方法，在方法中打印一个10*8的*型矩形，在main方法中调用该方法
 * 3.2 修改上一个程序，在method方法中，除打印一个10*8的*矩形外，再计算该矩形的面积
 *     并将其作为方法的返回值。在main方法中调用该方法，接收返回的面积并打印
 * 3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印m*n的*型矩形
 *     并计算该矩形的面积，将其作为方法返回值，在main方法中调用该方法，接收返回值的面积并打印
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-10-7:36
 */
public class oopTest6 {

    public static void main(String[] args) {

        oopTest6 test = new oopTest6();

        //3.1测试
        //test.method();

        //3.2测试
        //方法一
//		int area = test.method();
//		System.out.println("面积是："+area);

        //方法二
//		System.out.println("面积是："+test.method());//因为方法的返回值是一个int 型的变量，可以直接用输出语句输出

        //3.3测试
        System.out.println("面积是："+test.method(4, 9));//两个形参之间直接按Tab键就可以快速切换

    }

    //3.1
//    public void method(){
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//    }

    //3.2
//    public int method(){
//        for(int i=0;i<10;i++) {
//			for(int j=0;j<8;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		return 10*8;
//    }

    //3.3
    public int method(int m,int n) {
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m*n;
    }

}
