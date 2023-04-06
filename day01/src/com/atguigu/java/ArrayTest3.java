package com.atguigu.java;

import java.util.Scanner;

/**
 * @author philo
 * @Description
 *
 * 从键盘读入学生的成绩，找出最高分，并输出学生成绩等级
 *     成绩>=最高分-10 等级为‘A’
 *     成绩>=最高分-20 等级为‘B’
 *     成绩>=最高分-30 等级为‘C’
 *     其余等级为‘D’
 *
 *     提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:17
 */
public class ArrayTest3 {

    public static void main(String[] args) {
        //1、使用Scanner读取学生的成绩
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生的人数：");
        int number = input.nextInt();//先写input.nextInt();
        // 光标放在括号后alt + 回车自动创建变量

        //2、创建数组，存储学生的成绩，动态初始化
        int[] scores = new int[number];

        //3、遍历数组中的每个元素进行赋值
        System.out.println("请分别输入" + number + "个学生的成绩:");
        for (int i = 0; i < scores.length; i++) {
            //System.out.println("请输入第"+(i+1)+"学生的成绩");
            scores[i] = input.nextInt();
        }

        //4、获取数组中元素的最大值：最高分
        int maxScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        } //可以把第四步直接放到第三步中不用连着遍历两次

        //5、根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出成绩和等级
        char level;
        for(int i = 0; i < scores.length; i++) {
            if(maxScore-scores[i] <= 10) {
                level='A';
            }
            else if(maxScore-scores[i] <= 20) {
                level='B';
            }
            else if(maxScore-scores[i] <= 30) {
                level='C';
            }
            else {
                level='D';
            }
            System.out.println("Student "+(i+1)+",score is "+scores[i]+",grade is "+level);
        }


    }

}
