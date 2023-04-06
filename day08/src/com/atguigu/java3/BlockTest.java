package com.atguigu.java3;

/**
 * @author philo
 * @Description
 *
 * 类的成员之四：代码块（或初始化块）
 *
 * 1. 代码块的作用：用来初始化类、对象
 * 2. 代码块如果有修饰的话，只能使用static.
 * 3. 分类：静态代码块  vs 非静态代码块
 *
 * 4. 静态代码块
 * 	   >内部可以有输出语句
 * 	   >随着类的加载而执行, >>>而且只执行一次<<<
 * 	   >作用：初始化类的信息
 * 	   >如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 * 	   >静态代码块的执行要优先于非静态代码块的执行
 * 	   >静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构
 *
 * 5. 非静态代码块
 * 		>内部可以有输出语句
 * 		>随着对象的创建而执行
 * 		>每创建一个对象，>>>就执行一次非静态代码块<<<
 * 		>作用：可以在创建对象时，对对象的属性等进行初始化
 * 		>如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 * 		>非静态代码块内可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法
 *
 *
 * 对属性赋值的位置
 * ①默认初始化
 * ②显式初始化
 * ③构造器中初始化
 * ④创建对象 通过“对象.属性”或者“对象.方法”的方式进行赋值
 * ⑤在代码块中赋值
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-21-13:21
 */
public class BlockTest {

    public static void main(String[] args) {

        String desc = Person.desc;
        System.out.println(desc);
        //只会打印一次静态代码块

        Person p1 = new Person();
        Person p2 = new Person();
        //有两个对象所以会打印两次非静态代码块
        System.out.println(p1.age);

        Person.info();

    }

}

class Person{

    //属性
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person(){
        super();
    }

    public Person(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    //非静态代码块
    {
        System.out.println("hello, block - 2");
    }

    {
        System.out.println("hello, block - 1");
        //调用非静态结构
        age = 1;
        eat();
        //调用非静态结构
        desc = "我是一个爱学习的人1";
        info();
    }

    //static的代码块
    static{
        System.out.println("hello,static block-2");
    }

    static{
        System.out.println("hello,static block-1");
        //调用静态结构
        desc = "我是一个爱学习的人——static";
        info();

        //不可以调用非静态结构
//      Non-static method or field cannot be referenced from a static context
//		eat();
//		name = "Tom";
    }


    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString(){
        return "Person [name = " + name + ", age = " + age + "]";
    }

    public static void info(){
        System.out.println("我是一个快乐的人！——info()");
    }


}
