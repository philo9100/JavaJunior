package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 如何调试程序
 * 1.System.out.println();
 *
 * 2.Eclipse - Debug调试
 *
 * 	设置断点 （注意可以设置多个断点）
 * 	debug as java application
 * 		操作						作用
 * 		step into 跳入			进入当前行所调用的方法中
 * 		step over 跳过			执行完当前行的语句，进如下一行
 * 		step return 跳回			执行完当前行所在的方法，进入下一行
 * 		drop to frame			回到当前行所在的方法的第一行
 * 		resume	恢复				执行完当前行所在断点的所有代码，进入下一个断点，如果没有就结束
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-14-15:40
 */
public class DebugTest {

    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        System.out.println("i = " + i + ", j = " + j);

        DebugTest test = new DebugTest();
        int max = test.getMax(i, j);

        System.out.println("max = " + max);
    }

    private int getMax(int k, int m) {
        int max = 0;
        if (k < m) {
            max = k;
        } else {
            max = m;
        }
        return max;
    }

}
