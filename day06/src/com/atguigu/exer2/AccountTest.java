package com.atguigu.exer2;

/**
 * @author philo
 * @Description
 *
 * 写一个用户程序测试Account类，用户程序中
 * 创建一个账户为1122，余额为20000、年利率为4.5%的Account对象
 * 使用withdraw取30000元，并打印余额
 * 再使用withdraw取2500元
 * 使用deposit存3000，然后打印余额和月利率
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-14-15:05
 */
public class AccountTest {

    public static void main(String[] args) {

        Account acct = new Account(1122, 20000, 0.045);

        acct.withdraw(30000);
        System.out.println("您的账户余额为：" + acct.getBalance());
        acct.withdraw(2500);
        System.out.println("您的账户余额为：" + acct.getBalance());
        acct.deposit(3000);
        System.out.println("您的帐户余额为" + acct.getBalance());
        System.out.println("月利率为：" + (acct.getMonthlyInterest() * 100) + "%");

    }

}
