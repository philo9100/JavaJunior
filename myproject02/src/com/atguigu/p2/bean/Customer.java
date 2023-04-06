package com.atguigu.p2.bean;

/**
 * @author philo
 * @Description
 *
 * Customer为实体对象，用来封装客户信息
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-26-11:16
 */
public class Customer {

    //属性
    private String name;  //客户姓名
    private char gender;  //客户性别
    private int age;	  //客户年龄
    private String phone; //客户电话
    private String emali; //客户邮箱

    //构造器
    public Customer() {

    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.emali = emali;
    }

    //方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmali() {
        return emali;
    }

    public void setEmali(String emali) {
        this.emali = emali;
    }

}
