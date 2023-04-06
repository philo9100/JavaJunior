package com.atguigu.java1;

/**
 * @author philo
 * @Description
 *
 *  一、理解"万事万物皆对象"
 *		1.在Java语言范畴中，我们都将功能、结构等封装在类中，通过类的实例化，来调用具体的功能结构
 *			>Scanner、String 类等
 *			>关于存放文件的类，File
 *			>关于存放网络资源的类，URL
 *			>
 *		2.涉及到Java语言与前端Html、后端的数据库交互时，前后端的结构在Java层面交互时，都体现为类、对象
 *
 *	二、内存解析的说明
 *		1.引用类型的变量，只可能存储两类值: null 或 地址值（含变量的类型）
 *
 *
 *	三、匿名对象的使用
 *		1.理解: 我们创建的对象，没有显示的赋给一个变量名。即为匿名对象
 *
 *		2.特征: 匿名对象只能调用一次
 *
 *		3.使用:
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-11-15:12
 */
class Phone{

    double price; //价格

    public void sendEmail() {
        System.out.println("发送邮件");
    }

    public void playGame() {
        System.out.println("玩小游戏");
    }

    public void showPrice() {
        System.out.println("手机价格为" + price);
    }

}

/* 匿名对象在开发中的应用举例 */
class PhoneMall{

    public void show(Phone phone) {
        phone.sendEmail();
        phone.playGame();
    }

}

public class InstanceTest01 {

    public static void main(String[] args) {

        Phone p = new Phone();
//		p = null;
        System.out.println(p);  //地址值

        p.sendEmail();
        p.playGame();


        //匿名对象
//		new Phone().sendEmail();
//		new Phone().playGame();
        //因为每 new 一次就相当于在堆空间中开辟一个空间
        //所以上面两个 new 出来的是不同的对象，也就是说用匿名对象的方法 new 出来的这个对象只能使用一次


        new Phone().price = 1999;
        new Phone().showPrice(); // 0.0
        // 因为是new了两个不同的对象第一次的赋值并不会影响第二次,所以第二次打印的是默认初始化值


        //************************************************************************************************************
        //匿名对象在开发中的应用举例

        //调用show方法，就要创建方法所在类的对象
        PhoneMall mall= new PhoneMall();
        mall.show(p); //对象p 是一个引用数据类型（类）Phone类型的数据。
        // 而show方法的参数类型也是引用数据类型（类）Phone类型
        //所以p可以作为show方法的形式参数


        //匿名对象的使用，就可以不再像上面那样创建一个 Phone类型 的具体对象p
        //而是直接使用 Phone类型 作为show方法的形式参数 ，而形式参数可以作为局部变量被重复使用
        //其实show方法的形式参数 在定义时就已经赋名为phone 再调用show方法赋值匿名对象 new Phone()  后
        //相当于 Phone phone = new Phone(); 也就不再是所谓的匿名对象了 作为局部变量可以反复使用 phone
        mall.show(new Phone());

    }
}
