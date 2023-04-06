package com.atguigu.java4;

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
 * 		编译，看左边   运行，看右边
 *
 *
 * 4.多态性的使用前提：①类的继承关系 ②方法的重写
 *
 * 5.对象的多态性：只适用于方法，不适用于属性
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-17-10:45
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
        //多态性也叫对象的多态性:父类的引用指向子类的对象
        Person p2 = new Man();
//        Person p3 = new Woman();

        //多态性的使用：当调用子父类同名同参的方法时，实际执行的是子类重写父类的方法-----虚拟方法的调用
        p2.eat();
        p2.walk();
        //ctrl点击方法名会到父类的方法中说明编译时看的是父类，而实际运行时运行的是子类

        //相当于把程序分为了两个状态一个是编译时的状态，另一个是运行时的状态，编译时看左边Person属性，运行时发现Man中重写了这个方法
//		p2.earnMoney();
        //Cannot resolve method 'earnMoney' in 'Person'
        //The method earnMoney() is undefined for the type Person
        //不能调用子类中特有的方法，编译时p2是person类型

        //对象的多态性：只适用于方法，不适用于属性
        //父类中有id的属性，子类中也有id的属性通过多态的方法，父类的引用指向子类的对象
        //通过调用id属性运行时发现运行的还是父类的属性，多态性不适用于属性
        System.out.println(p2.id); // 1001 or 1002? ——————> 1001

    }

}
