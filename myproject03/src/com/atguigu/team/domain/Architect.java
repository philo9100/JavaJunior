package com.atguigu.team.domain;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-29-12:46
 */
public class Architect extends Designer{

    private int stock; //股票

    public Architect() {
        super();
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return 员工的所有信息
     */
    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
    }

    /**
     * 作为团队成员的信息
     */
    public String getDetailsForTeam() {
        return getTeamBaseDetails() + "\t架构师\t" + getBonus() + "\t" + stock;
    }

}
