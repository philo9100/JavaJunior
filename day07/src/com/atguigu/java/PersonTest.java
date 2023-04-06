package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 面向对象的特征之三：多态性
 *
 * 1.理解动态性：可以理解为一种事物的多种形态
 * 2.何为多态性：对象的多态性，父类的引用指向子类的对象（或者子类的对象赋给父类的引用）
 *
 * 3.多态的使用：虚拟方法调用
 * 	有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法
 *
 * 总结：
 * 		编译，看左边，运行，看右边
 *
 *
 * 4.多态性的使用前提：①类的继承关系 ②方法的重写
 *
 * 5.对象的多态性：只适用于方法，不适用于属性（编译和运行都看右边）
 *
 * *****************************************************************
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-17-11:40
 */
public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        //********************************************************
        System.out.println("**********************************");
        //对象的多态性:父类的引用指向子类的对象
        Person p2 = new Man();
//		Person p3 = new Woman();

        //多态性的使用：当调用子父类同名同参的方法时，实际执行的是子类重写父类的方法-----虚拟方法的调用
        p2.eat();
        p2.walk();

//		p2.earnMoney();
        //The method earnMoney() is undefined for the type Person
        //相当于把程序分为了两个状态一个是编译时的状体，另一个是运行时的状态
        //编译时看左边Person属性，Person类中并没有earnMoney()

        //对象的多态性：只适用于方法，不适用于属性
        System.out.println(p2.id); // 1001 or 1002? ——————> 1001

        System.out.println("**********************************************");
        //不能调用子类所持有的方法，属性。编译时，p2是Person类型的
        p2.name = "Tom";
//		p2.earnMoney();
//		p2.isSmoking = true;
        //cannot be resolved or is not a field
        //有了对象的多态性以后。内存中实际上是加载了子类特有的属性的方法，但是由于变量声明为父类类型，导致
        //编译时，只能调用父类中声明的属性和方法，子类持有的属性和方法不能调用

        System.out.println("**********************************************");
        //如何可以调用子类中持有的属性和方法
        //向下转型：使用强制类型转换符
        Man m1 = (Man)p2;
        m1.earnMoney();
        m1.isSmoking = true;

        //使用强转时，可能出现ClassCastException的异常
//		Woman w1 = (Woman)p2;
//		w1.goshopping();

        /*
         * instanceof关键字的使用:
         *
         *  a instanceof A:判断对象a是否是类A的实例。如果是，返回true,如果不是，返回false
         *
         *  使用情景：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先进性instanceof的判断，一旦返回true，就进行向下转型，如果对返回false，不进行向下转型
         *  因为在p2在初始化时就new的是Man
         *
         *  如果 a instanceof A 返回true ，则 a instanceof B返回也是true
         *  其中，类B是类A的父类。
         *
         */

        if(p2 instanceof Woman) {
            Woman w1 = (Woman)p2;
            w1.goshopping();
            System.out.println("*********Woman true***********");
        }

        if(p2 instanceof Man) {
            Man m2 = (Man)p2;
            m2.earnMoney();
            System.out.println("*********Man true***********");
        }

        if(p2 instanceof Person) {
            System.out.println("*********Person true**********");
        }

        if(p2 instanceof Object) {
            System.out.println("*********Object true**********");
        }

        //练习：
        //问题一：编译时通过，运行时不通过
        //举例一：
//		Person p3 = new Woman();
//		Man m3 = (Man)p3;
        //举例二：
//		Person p4 = new Person();
//		Man m4 = (Man)p4;


        //问题二：编译时通过，运行时也通过
//		Object obj = new Woman();
//		Person p = (Person)obj;

        //问题三：编译就不通过
//		Man m5 = new Woman(); //Type mismatch: cannot convert from Woman to Man
        //数据类型不匹配
//		String str = new Date(); //Type mismatch: cannot convert from Date to String

        //编译通过运行不通过
//		Object o = new Date();
//		String str1 = (String)o;
        //不相关的两个类是不可以赋值的

    }

}
