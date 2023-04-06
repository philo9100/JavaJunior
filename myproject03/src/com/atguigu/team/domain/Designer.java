package com.atguigu.team.domain;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-29-12:37
 */
public class Designer extends Programmer{

    private double bonus; // 奖金

    public Designer() {
        super();
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus){
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * 员工的所有信息
     */
    @Override
    public String toString(){
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t\t" + getEquipment().getDescription();
    }

    /**
     * 作为团队成员的信息
     */
    public String getDetailsForTeam() {
//		return getMemberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t设计师\t" + bonus;
        return getTeamBaseDetails() + "\t设计师\t" + bonus;
    }

}
