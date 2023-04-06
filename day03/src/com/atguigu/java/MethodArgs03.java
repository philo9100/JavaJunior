package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 可变个数形参的方法
 *
 * 1.jdk 5.0新增的内容
 *
 * 2.具体使用：
 * 	 2.1 可变个数形参的格式：数据类型 ... 变量名
 *
 * 	 2.2 当调用可变个数形参的方法时，传入的实参个数可以是：0个、1个、2个 ...
 *
 * 	 2.3 可变个数形参的方法与本类中方法名相同，参数列表不同的方法之间构成重载
 *
 *	 2.4 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载，换句话说，二者不能共存。
 *
 *   2.5 可变个数形参在方法的形参中，必须声明在末尾 （如果有多个数据类型的形参并且可变个数的形参没有声明在末尾在传入实参时没法保证传入实参的数据类型与可变个数的形参的数据类型相同）
 *
 *   2.6 因此由2.5 衍生出了，可变个数形参在方法的形参中，最多只能声明一个可变个数形参。(如果有多个无法满足都声明在末尾)
 *
 * 调用 可变个数形参的方法 时，填充的实参的数据类型必须与该方法形参的数据类型匹配
 * 如果存在一个具体的方法其参数列表（参数数据类型 参数个数）与填入的实参的数据类型和实参个数 都匹配，在存在相同 可变个数形参的方法 时
 * 优先调用那个具体形参列表的方法，而不是 可变个数形参的方法
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-11-11:36
 */
public class MethodArgs03 {

    public static void main(String[] args) {

        MethodArgs03 test = new MethodArgs03();

        test.show(12); //
        test.show(); //实参个数为0个

        test.show("hello"); //实参个数为1个
        test.show("hello" ,"hi"); //实参个数为2个
        test.show("hello" ,"hi" ,"good");//实参个数为3个
        //调用三个可变形参个数的方法，实参个数不同，但是调用的是同一种方法

        test.show(new String[]{"aa", "bb", "cc"});
        //ctrl 点击方法名show 自动跳到 带有形参 String ... strs 这个方法
        //说明 String ... strs 就是 new String[] {"aa" , "bb" , "cc"}
        //说明系统默认 String ... strs 就是一个 String 类型的数组，
        //而且 String ... strs 这个形参的方法可以使用 数组的 length属性，遍历的方法和数组一样
        test.show("aa", "bb", "cc");
    }

    public void show(int i){

    }

    public void show(String s){
        System.out.println("show(String)");
    }

    //可变个数形参的方法，针对实参个数不定的方法
    public void show(String ... strs){
        System.out.println("show(String ... strs)");

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i] + " ");
        }
    }

//    public void show(String[] strs){
//
//    } //'show(String[])' is already defined in 'com.atguigu.java.MethodArgs03'
        ////这个方法和上面 可变个数形参的方法 本质上是一样的，由于版本问题
    //	//jdk 5.0 之后提供了 可变个数形参的方法，也可以接着使用数组形参的方法


}
