package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

/**
 * @author philo
 * @Description
 *
 * 关于开发团队成员的管理，添加，删除等。
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-29-13:46
 */
public class TeamService {

    private static int counter = 1; //给memberId赋值使用
    private final int MAX_MEMBER = 5; //限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER]; //保存开发团队成员
    private int total; //记录开发团队中实际的人数

    public TeamService(){
        super();
    }

    /**
     * 获取开发团队中的所有成员
     * @return
     */
    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }


    public void addMember(Employee e) throws TeamException {
        //成员已满，无法添加
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        //该成员不是开发人员，无法添加
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        //该员工已在本开发团队中
        if(isExist(e)){
            throw new TeamException("该员工已在本开发团队中");
        }
        //该员工已是某团队成员
        //该员工正在休假
        Programmer p = (Programmer) e;//不会出现ClassCastException
        if("BUSY".equals(p.getStatus().getNAME())){
            throw new TeamException("该员工已是某团队成员");
        }else if("VOCATION".equals(p.getStatus().getNAME())){
            throw new TeamException("该员工正在休假，无法添加");
        }
//		if(!("FREE".equals(p.getStatus().getNAME()))) {
//			throw new TeamException("该员工已是某团队成员或该员工正在休假");
//		}

//		团队中至多有一名架构师
//		团队中至多有两名设计师
//		团队中至多有三名程序员
        //获取team团队已有成员中架构师，设计师，程序员的人数
        int numOfArch = 0, numOfDes = 0, numOfProg = 0;
        for(int i = 0; i < total; i++){
            if(team[i] instanceof Architect){
                numOfArch++;
            }else if(team[i] instanceof Designer){
                numOfDes++;
            }else if(team[i] instanceof Programmer){
                numOfProg++;
            }
            //顺序不能错如果从下向上的顺序判断，那么就全是Prog，剩下的两个人数全是0
        }
        if(p instanceof Architect){
            if(numOfArch >= 1){
                throw new TeamException("团队中至多有一名架构师");
            }
        }else if(p instanceof Designer){
            if(numOfDes >= 2){
                throw new TeamException("团队中至多有两名设计师");
            }
        }else if(p instanceof Programmer){
            if(numOfProg >= 3){
                throw new TeamException("团队中至多有三名程序员");
            }
        }
        //将p (或e)添加到现有的team中
        team[total++] = p;
        //p的状态转换
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
    }

    /**
     * 判断指定的员工是否已经存在于现有的开发团队中
     * @param e
     * @return
     */
    private boolean isExist(Employee e){
        for (int i = 0; i < total; i++) {
//            if(team[i].getId() == e.getId()){
//                return true;
//            }
            return team[i].getId() == e.getId();
        }
        return false;
    }

    /**
     * 从团队中删除成员
     * @param memberId
     */
    public void removeMerber(int memberId) throws TeamException {
        int i = 0;
//      boolean isFlag = true;
        for (; i < total; i++){
            if(team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
//              isFlag = false;
                break;
                //此时的 i 就是要找的memberId对应的员工在开发团队这个数组中对应的索引值
            }
        }

        //针对未找到指定memberId的情况
        //判断方法一：
//      if(isflag) {throw new TeamException("找不到指定memberId的员工，删除失败");}
        //判断方法二：
        if(i == total){
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }

        //找到指定memberId的情况
        //后一个元素覆盖前一个元素，实现删除操作
        //此时的 i 就是要找的memberId对应的员工在开发团队这个数组中对应的索引值
        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }

        //写法1
//		team[total - 1] = null;
//		total--;
        //或2
        team[--total] = null;
    }

}
