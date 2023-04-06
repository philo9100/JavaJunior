package com.atguigu.team.junit;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import org.junit.Test;

/**
 * @author philo
 * @Description
 *
 * NameListService类的测试
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-30-17:11
 */
public class NameListServiceTest {

    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        int id = 1;
            id = 101;
        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee.toString());
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

}
