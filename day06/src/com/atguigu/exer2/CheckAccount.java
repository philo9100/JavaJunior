package com.atguigu.exer2;

/**
 * @author philo
 * @Description
 *
 * 创建Account类的一个子类CheakAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额
 * 在CheakAccount类中重写withdraw方法，其算法如下
 * 			如果（取款金额<账户余额）
 * 			可直接取款
 * 			如果（取款金额>账户余额）
 * 			计算需要透支的额度
 * 			判断可透支的overdraft是否足够支持本次需要，如果可以
 * 				将账户余额修改为0，冲减可透支余额
 * 			如果不可以
 * 				提示用户超过可透支的限额
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-14-15:05
 */
public class CheckAccount extends Account{

    private double overdraft; //可透支的余额

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft(){
        return overdraft;
    }

    public void setOverdraft(double overdraft){
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= getBalance()){//余额足够消费
            //方式一
//			setBalance(getBalance() - amount);
            //方式二
            super.withdraw(amount);
        }else if(overdraft >= amount - getBalance()){//透支额度+余额足够消费
            overdraft -= (amount - getBalance());
            //方式一
//			setBalance(0);
            //方式二
            super.withdraw(getBalance());
        }else{
            System.out.println("超过可透支限额！");
        }
    }

}
