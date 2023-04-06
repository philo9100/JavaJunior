package com.atguigu.java2;

/**
 * @author philo
 * @Description
 *
 * 在idea中右键 More Ran 点击 modify Run Configuration
 *  在左边找到编译后生成的字节码文件MainDemo 在右边找到Arguments 在Program arguments 中填入参数 之后点击Run
 *
 *  或者
 *
 *  复制源文件到一个文件夹中打开命令控制符 先编译 再运行的过程中输入参数
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-21-11:56
 */
public class MainDemo {

    public static void main(String[] args) {

        for(int i = 0; i < args.length; i++){
            System.out.println("*****" + args[i]);

            int num = Integer.parseInt(args[i]);
            System.out.println("#####" + num);

        }

    }

}
