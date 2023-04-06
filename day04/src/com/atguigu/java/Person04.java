package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * 1.创建程序，在其中定义两个类，Person和PersonTest类，定义如下
 * 	用setAge()设置人的合法年龄（0 ~ 130），用getAge()返回人的年龄
 *
 *
 * 2.练习2
 * 2.1 在定义前面的Person类中添加构造器，利用构造器设置所有人的age属性初始化值都为18
 * 2.2 修改上题中类和构造器，增加name属性，使得每次创建Person对象的同时初始化对象的age属性值和name属性的值
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-9:29
 */
public class Person04 {

    //属性
    private int age;
    private String name;


    //构造器
    public Person04() {
        age = 18;
    }
    public Person04(String n,int a) {
        name = n;
        age = a;
    }


    //方法
    public void setAge(int a) {
        if(a < 0 || a > 130) {
//			throw new RuntimeException("传入的数据非法");
            System.out.println("传入的数据非法！");
            return;
        }
        age = a;
    }
    public int getAge() {
        return age;
    }


    //绝对不要这样写,是set就写set 是get就写get，两个写一起表达的含义不一样
    //set的目的就是让设置属性的，get是获取set后的属性，如果写在一起就好比我说你叫张三然后我再问你叫什么
//	public int doAge(int a) {
//		age = a;
//		return age;
//	}


    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }

}
