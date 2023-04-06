package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-29-12:14
 */
public class Programmer extends Employee{

    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer(){
        super();
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment){
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    /**
     * 员工的所有信息
     */
    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }

    /**
     * 作为团队成员的基本信息
     */
    public String getTeamBaseDetails() {
        return "  " + memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
    }

    /**
     * 作为团队成员的所有信息
     * @return 团队中成员的全部信息
     */
    public String getDetailsForTeam(){
//      return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t程序员";
        return getTeamBaseDetails() + "\t程序员";
    }

}
