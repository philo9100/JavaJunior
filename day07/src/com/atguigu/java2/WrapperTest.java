package com.atguigu.java2;

import org.junit.Test;

/**
 * @author philo
 * @Description
 *
 * 包装类的使用：
 * 1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 *
 * 2.掌握：基本数据类型、包装类、String三者之间的相互转化
 *
 *
 * >>>>从下往上看
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-17-12:36
 */
public class WrapperTest {

    //String类型————————>（基本数据类型、包装类）（自动拆封），调用包装类的parseXxx(String s)
    @Test
    public void test5(){
        String str1 = "123";
        //错误情况
//		int num1 = (int)str1; //不能强转成基本数据类型
//		Integer in1 = (Integer)str1; //没有子父类的继承关系
        //可能会报NumberFormatException
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1); //124

        String str2 = "true";
        String str3 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1); //true
        boolean b2 = Boolean.parseBoolean(str3);
        System.out.println(b2); //false
    }


    //（基本数据类型、包装类）（自动拆封）————>String类型：调用String重载的valueOf(Xxx xxx)
    @Test
    public void test4(){
        //基本数据类型————————>String类型
        int num1 = 10;
        //方法1：连接运算，数据类型提升
        String str1 = num1 + "";
        //方法2：调用String的valueOf(Xxx xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(12.3f);//"12.3"
        System.out.println(str2);//"12.3"

        //包装类————————>String类型
        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str3);//"12.4"
    }


    /*
     *  JDK 5.0新特性，自动装箱与拆箱
	 * 不需要再通过创建 基本数据类型对应的包装类的对象 进行转换
	 * 可以直接把一个基本数据类型的变量赋给它对应的包装类 int num1 = 10; Integer in1 = num1;
	 * 可以直接把一个包装类赋给它对应的基本数据类型的变量 Integer in1 = num1; int num2 = in1;
     */
    @Test
    public void test3(){
        int num1 = 10;
        method(num1);//并不是说 Object obj = num1;
                     //而是有一个自动装箱和拆箱的功能 Object obj = new Integer(num1);

        //自动装箱:基本数据类型——————>包装类的对象
        int num2 = 10;
        Integer in1 = num2;//自动装箱，可以直接把一个基本数据类型的变量赋给它对应的包装类

        boolean b1 = true;
        Boolean b2 = b1;//自动装箱

        //自动拆箱:包装类——————>基本数据类型
        System.out.println(in1.toString());
        int num3 = in1;//自动拆箱，可以直接把一个包装类赋给它对应的基本数据类型的变量
    }
    public void method(Object obj){
        System.out.println(obj);
    }



    //包装类——————>基本数据类型：调用包装类Xxx.xxxValue()
    //包装类作为一个类没法进行运算，所以考虑把它变成基本数据类型
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float fl1 = new Float(12.3f);
        float f1 = fl1.floatValue();
        System.out.println(f1 + 1);
    }


    //基本数据类型——————>包装类、调用包装类的构造器
    //把基本数据类型转换成一个类
    @Test
    public void test1(){

        int num1 = 10;
//        System.out.println(num1.toString());
//        Cannot invoke toString() on the primitive type int
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        //报异常 ：NumberFormatException
//		Integer in3 = new Integer("123abc");
//		System.out.println(in3.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 =new Boolean("tRuE");
        System.out.println(b2);//true
        //根据源码知道Boolean类型的包装类忽略大小写之后除了true 都是false
        Boolean b3 =new Boolean("true123");
        System.out.println(b3);//false

        Order order = new Order();
        System.out.println(order.isMale);//基本数据类型默认初始化值false
        System.out.println(order.isFemale);//包装类 引用数据类型默认初始化值null

    }

}

class Order{
    boolean isMale;
    Boolean isFemale;
}
