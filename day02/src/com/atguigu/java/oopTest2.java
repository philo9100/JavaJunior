package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 类中属性的使用
 *
 * 属性（成员变量） vs  局部变量
 *
 * 1.相同点：
 *         1.1定义变量的格式：数据类型 变量名 = 变量值;
 *         1.2先声明，后使用
 *         1.3变量都有其对应的作用域
 *
 * 2.不同点：
 *         2.1在类中声明的位置不同
 *         属性：直接定义在类的一对{}内
 *
 *         局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
 *
 *         2.2关于权限修饰符的不同
 *         属性：可以在声明属性时，指明其权限，使用权限修饰符
 *         	    常用的权限修饰符：private、public、缺省、protected  ---> 封装性
 *
 *         局部变量：不可以使用权限修饰符
 *
 *         2.3默认初始化值的情况
 *         属性：类的属性，根据其类型，都有默认初始化值
 *               整型(byte、short、int、long) 0
 *               浮点型(float、double) 0.0
 *               字符型(char) 0 (或'\u0000')
 *               布尔型(boolean) false
 *
 *               引用数据类型(类、数组、接口) null
 *
 *         局部变量：没有默认初始化值
 *                 意味着我们在调用局部变量之前，一定要给显式变量赋值
 *                 特别的，在调用形参时，我们在调用时赋值即可，不赋值也会报错
 *
 *         2.4在内存中加载的位置：
 *         属性：加载到堆空间中（非static）
 *
 *         局部变量：加载到栈空间中
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-10-7:35
 */
public class oopTest2 {

    public static void main(String[] args) {

        User u1 = new User();
        System.out.println(u1.name);
//        System.out.println(u1.age);//'age' has private access in 'com.atguigu.java.User'
        System.out.println(u1.isMale);

        u1.talk("chinese");

    }
}

class User{

    //属性（成员变量）
    public String name;
    private int age;
    protected boolean isMale;

    public void talk(String language){//language是形参，即局部变量 在调用方法时赋值
        System.out.println("我们使用"+language+"进行交流");
    }

    public void eat(){
        String food = "烙饼"; //定义在方法内的变量，即局部变量
        System.out.println("北方人喜欢吃" + food);
    }
}
