package com.atguigu.team.service;

/**
 * @author philo
 * @Description
 *
 * 自定义的异常类
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-29-13:38
 */
public class TeamException extends Exception{

    static final long serialVersionUID = -3387514229948L;

    public TeamException(){
        super();
    }

    public TeamException(String msg){
        super(msg);
    }

}
