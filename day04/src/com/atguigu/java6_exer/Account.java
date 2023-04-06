package com.atguigu.java6_exer;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-14-11:12
 */
public class Account {

    private double balance;

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance(){
        return balance;
    }

    /**
     * 存钱
     * @param amt 数额
     */
    public void deposit(double amt) {
        if(amt > 0) {
            balance += amt;
            System.out.println("存钱成功");
        }
    }

    /**
     * 取钱
     * @param amt 数额
     */
    public void withdraw(double amt) {
        if(balance > amt) {
            balance -= amt;
            System.out.println("取钱成功");
        }else {
            System.out.println("余额不足");
        }
    }


}
