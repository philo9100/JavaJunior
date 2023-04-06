package com.atguigu.exer2;

/**
 * @author philo
 * @Description
 *
 * 写一个用户测试程序CheckAccountTest类
 * 在用户程序中，创建一个账号为：1122，余额为；20000，年利率为4.5%，可透支限额为5000元的CheckAccount对象
 *		使用withdraw方法提款5000元，并打印账户余额和可透支限额
 *		在使用withdraw方法提款18000元，并打印账户余额和可透支限额
 *		在使用withdraw方法提款3000元，并打印账户余额和可透支限额
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-14-15:05
 */
public class CheckAccountTest {

    public static void main(String[] args) {

        CheckAccount acct = new CheckAccount(1122, 20000,
                0.045, 5000);

        acct.withdraw(5000);
        System.out.println("您的帐户余额为：" + acct.getBalance());
        System.out.println("您的可透支额度为：" + acct.getOverdraft());

        acct.withdraw(18000);
        System.out.println("您的帐户余额为：" + acct.getBalance());
        System.out.println("您的可透支额度为：" + acct.getOverdraft());

        acct.withdraw(3000);
        System.out.println("您的帐户余额为：" + acct.getBalance());
        System.out.println("您的可透支额度为：" + acct.getOverdraft());


    }

}