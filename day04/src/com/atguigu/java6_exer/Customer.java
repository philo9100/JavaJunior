package com.atguigu.java6_exer;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-14-11:12
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l){
        this.firstName = f;
        this.lastName = l;
    }

    public Account getAccount(){
        return account;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

}
