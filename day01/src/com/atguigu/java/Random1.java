package com.atguigu.java;

import java.util.Random;
import java.util.Scanner;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:27
 */
public class Random1 {

    public static void main(String[] args) {
        //1、获取一个1-100之间的随机数，让用户猜
        //1.1创建Random类的的对象
        Random r=new Random();
        //1.2 获取指定范围的随机数
        int num=r.nextInt(100)+1;//r.nextInt(100) --->0-99

        //通过键盘录入获取用户猜的数字，并接收
        //2.1创建键盘录入类的对象
        Scanner sc=new Scanner(System.in);
		/*//2.2提示用户录入要猜的数，并接收
		System.out.println("请输入您要猜的数字（1-100）");
		int guessNum=sc.nextInt();

		//3、比较两个数，看是否一致，并给出相应提示
		if(guessNum>num) {
			System.out.println("您猜大了");
		}
		else if(guessNum<num) {
			System.out.println("您猜小了");
		}
		else {
			System.out.println("恭喜您，猜对了");
		}
		*/

        //4、因为不知道用户多少次能猜对，所以用无限循环改进
        while(true) {
            //2.2提示用户录入要猜的数，并接收
            System.out.println("请输入您要猜的数字（1-100）");
            int guessNum=sc.nextInt();

            //3、比较两个数，看是否一致，并给出相应提示
            if(guessNum>num) {
                System.out.println("您猜大了");
            }
            else if(guessNum<num) {
                System.out.println("您猜小了");
            }
            else {
                System.out.println("恭喜您，猜对了");
                //猜对了，循环结束
                break;
            }
        }


    }

}
