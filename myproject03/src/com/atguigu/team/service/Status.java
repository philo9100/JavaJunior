package com.atguigu.team.service;

/**
 * @author philo
 * @Description
 *
 * 表示员工的状态
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-29-12:15
 */
public class Status {

    private final String NAME;

    private Status(String name){
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");

    public String getNAME(){
        return NAME;
    }

    @Override
    public String toString(){
        return NAME;
    }

}
