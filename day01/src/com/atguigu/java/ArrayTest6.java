package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 获取arr数组中所有元素的和
 * i\j    j=0   j=1   j=2   j=3
 * i=0  |  3  |  5  |  8  |  \  |
 *
 * i=1  |  12 |  9  |  \  |  \  |
 *
 * i=2  |  7  |  0  |  6  |  4  |

 * @email 3424586889@qq.com
 * @Date 2021-09-08-13:25
 */
public class ArrayTest6 {

    public static void main(String[] args) {

        int[][] arr= {{3,5,8},{12,9},{7,0,6,4}};
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                sum +=arr[i][j];
            }
        }
        System.out.println("列表中数的总和为"+sum);

        /*
         * 声明：int[]x,y[];再给变量赋值后，以下允许通过编译的是
         * a、x[0]=y;          no
         * b、y[0]=x;          yes
         * c、y[0][0]=x;       no
         * d、x[0][0]=y;       no
         * e、y[0][0]=x[0];    yes
         * f、x=y;             no
         *
         *x是一个元素类型为int型的一维数组
         *y是一个元素类型为int型的二维数组
         * */

    }

}
