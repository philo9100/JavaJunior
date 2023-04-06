package com.atguigu.exer;

/**
 * @author philo
 * @Description
 *
 * 练习：
 * 若子类重写了父类的方法，就意味着子类里定义的方法彻底覆盖了父类里的同名方法
 * 系统将不可能把子类里的方法转移到子类中。 编译看左边，运行看右边
 *
 * 多态性不适用于属性
 * 对于实例变量则不存在这样的现象，即使子类里定义了与父类完全相同的实例变量，
 * 这个实例变量依然不可能覆盖父类中定义的实例变量。 编译运行都看左边
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-17-15:51
 */
class Base{
    int count = 10;

    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;

    public void display(){
        System.out.println(this.count);
    }
}


public class FieldMethodTest {

    public static void main(String[] args) {

        Sub s= new Sub();
        System.out.println(s.count); //20
        s.display(); //20

        Base b = s; //多态性 Base b = new Sub();
        // == 对于引用数据类型来讲，比较的是两个引用数据类型变量的地址值是否相同
        //自始至终在堆空间中就new了一个对象，只有一个地址值，将地址值赋给了父类Base 在栈空间中声明的b
        System.out.println(b == s); //true
        System.out.println(b.count); //10 多态性不适用于属性值 调的是Base的count所以值是10
                                    //new Sub(); 调用了父类的空参构造器通过构造器调用父类的count属性
        b.display(); //20 多态性的虚拟方法调用，运行时调用的是子类重写父类的方法

    }

}
