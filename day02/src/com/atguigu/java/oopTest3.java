package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 类中方法的声明和使用
 *
 * 方法：描述类应该具有的功能
 *     比如：Math类：sqrt()\ Random()\ .......
 *           Scanner类：nextXXX().....
 *           Arrays类：sort()\ binarySearch()\ toString()\ equals() .....
 *
 *  1.举例
 *  public void eat(){}  	//没有返回值	没有形参
 *  public void sleep(int hour){}	//没有返回值	有形参
 *  public String getName(){ return }  	//有返回值		没有形参
 *  public String getNation(String nation){ return }  //有返回值	有形参
 *
 *  2.方法的声明：权限修饰符 返回值类型 方法名( 参数列表（参数数据类型 形式参数） ){ 方法体 }
 *  //参数列表可以不止一个:  参数数据类型 形式参数1 , 参数数据类型 形式参数2 , ......
 *  //有具体的返回值用  return
 *  //没有具体的返回值  return可以省略不写
 *
 *  注意：static、final、abstract 来修饰的的方法，到后面再讲
 *
 *  3.说明：
 *        3.1关于权限修饰符：（目前默认方法的权限修饰符先都是用public ）
 *           java规定的4种权限修饰符：private、public、缺省、protected  ---> 封装性再细说
 *
 *        3.2返回值类型：有返回值 vs 没有返回值
 *            3.2.1
 *            如果方法有返回值，则必须在方法声明时，指定返回值的类型。同时，方法中，需要使用
 *            return关键字来返回指定类型的变量或者常量："return 数据"
 *
 *            如果方法没有具体返回值，则方法声明时，使用void来表示。通常，没有返回值的方法中
 *            就不需要使用return。但是，如果使用的话，只能 " return; "表示结束此方法
 *
 *            3.2.2：我们定义方法该不该有返回值：
 *                1.题目要求
 *                2.凭经验，凭借具体问题看需不需要返回数据，像Random()方法就要返回数值
 *                  还有binarySearch()也需要返回值数值
 *
 *        3.3方法名：属于标识符，遵循标识符的规则和规范，“见名知意”
 *
 *        3.4形参列表：方法可以声明0个、1个或多个形参
 *            3.4.1 格式：数据类型1 形参1,数据类型2 形参2, .......
 *
 *            3.4.2 我们定义方法时，该不该定义形参
 *                ①.题目要求
 *                ②.凭经验
 *
 *        3.5方法体：方法功能的体现
 *
 *  4. return关键字的使用：
 *         1.使用范围：使用在方法体中
 *         2.作用：①结束方法
 *                ②针对于有返回值类型的方法，使用 "return 数据" 方法返回所要的数据。
 *         3.注意点：return 关键字后面不可以声明执行语句
 *
 *
 *  5. 方法的使用中，可以调用当前类的的属性或方法
 *            特殊的：方法A中有调用了方法A:递归方法。
 *     方法中，不可以定义方法。
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-10-7:35
 */
public class oopTest3 {

    public static void main(String[] args) {

        Customer cust1 = new Customer();
        cust1.sleep(8);

    }

}

//客户类
class Customer{

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
        return;
        //return后面不可以声明表达式,提示无法到达
//		System.out.println("hello");
    }

    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时");

        eat();
    }

    public String getName(){
        if(age > 18){
            return name;
        }else{
            return "tom";
        }//必须要有返回值
//		return name;
//		return "tom"; //返回一个常量
    }

    public String getNation(String nation){
        String info = "我的国籍是" + nation;
        return info;
    }

}