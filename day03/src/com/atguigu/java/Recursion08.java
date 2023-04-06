package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 递归方法的使用（了解）
 * 1.递归方法：一个方法体内调用它自身
 * 2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无需循环控制。
 *  递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-11-14:40
 */
public class Recursion08 {

    public static void main(String[] args) {

    //例1 计算1 - 10之间所有自然数的和

        //方式一、循环结构
//		int sum = 0;
//		for(int i = 0 ; i <= 10 ; i++) {
//			sum += i;
//		}

        //方式二、递归方法的测试
        Recursion08 test = new Recursion08();
        System.out.println( test.getSum(10) );

        //例2
        System.out.println(test.f(10));

        //例3
        System.out.println(test.f1(10));

        //例4
        System.out.println(test.Fibonacci(4));

    }

    //方式二、递归方法
    public int getSum(int n){
        if(n == 1){
            return 1;
        }else{
            return n + getSum(n - 1);
        }
    }

    //例1、 利用递归方法 计算 n 的阶乘
    public int getJieCheng(int n){
        if(n == 1){
            return 1;
        }else{
            return n * getJieCheng(n - 1);
        }
    }

    //例2、已知有一个数列：f(0) = 1 , f(1) = 4 , f(n + 2) = 2 * f(n + 1) + f(n);
    //其中 n 是大于0的整数，求f(10)的值
    //提示;令 n + 2 = n；
    public int f(int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else{
            return 2 * f(n - 1) + f(n - 2);
        }
    }

    //例3、已知一个数列：f(20) = 1 , f(21) = 4 , f(n + 2) = 2 * f(n + 1) + f(n);
    //其中 n 是大于0的整数，求f(10)的值
    //提示；令f(n) = f(n + 2) - 2 * f(n + 1);
    public int f1(int n){
        if(n == 20){
            return 1;
        }else if(n == 21){
            return 4;
        }else{
            return f1(n + 2) - 2 * f1(n + 1);
        }
    }

    //例4、斐波那契数列
    //f(1) = 1 , f(2) = 1 , f(n + 2) = f(n + 1) + f(n);
    public int Fibonacci(int n) {
        if(n == 1) {
            return 1;
        }else if(n == 2) {
            return 1;
        }else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

}
