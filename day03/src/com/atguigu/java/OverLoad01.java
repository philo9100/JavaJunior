package com.atguigu.java;

/**
 * @author philo
 * @Description
 * 方法的重载（OverLoad）  loading... 加载中...
 *
 * 1、定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可
 *
 * 			"两同一不同": 同一个类、相同的方法名
 * 						 参数列表不同（参数个数不同、参数类型不同）
 *
 * 2、举例：
 *			Arrays类中的重载的方法sort()/ binarySearch()
 *
 *
 * 3、判断是否是重载：
 * 			跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系！
 *
 *
 * 4、在通过对象调用方法时，如何确定某一个指定的方法
 * 		方法名 ————> 参数列表
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-11-10:57
 */
public class OverLoad01 {

    public static void main(String[] args) {
        OverLoad01 test = new OverLoad01();
        test.getSum(1, 2);
    }

    //如下4个方法构成了重载

    public void getSum(int i, int j){
        System.out.println("1");
    }

    public void getSum(double d1, double d2){
        System.out.println("2");
    }

    public void getSum(String s1, String s2){

    }

    public void getSum(int i, String s){
        System.out.println("4");
    }
    //参数列表是有序的

    //如下的3种方法不能与上述4种方法构成重载

//    public int getSum(int i, int j){
//        return 0;
//    }  //getSum(int, int)' is already defined in 'com.atguigu.java.OverLoad01
       //参数列表与第一个相同，不能算是重载

//    public void getSum(int m, int n){
//
//    }  //'getSum(int, int)' is already defined in 'com.atguigu.java.OverLoad01'
       //与参数名无关

//    private void getSum(int i, int j){
//
//    }  //'getSum(int, int)' is already defined in 'com.atguigu.java.OverLoad01'
       //与权限修饰符无关


}
