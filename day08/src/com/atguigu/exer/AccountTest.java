package com.atguigu.exer;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-19-16:29
 */
public class AccountTest {

    public static void main(String[] args) {

        Account acct1 = new Account();
        Account acct2 = new Account("qwety", 2000);

        Account.setInterestRate(0.012);
        Account.setMinMoney(100);

        System.out.println(acct1);
        System.out.println(acct2);

        System.out.println(acct1.getInterestRate());
        System.out.println(acct1.getMinMoney());

    }

}
