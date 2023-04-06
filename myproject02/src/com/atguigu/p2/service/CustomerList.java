package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

/**
 * @author philo
 * @Description
 *
 * CustomerList为Customer对象的管理模块
 * 内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历的方法
 * 供CustomerView调用
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-26-11:18
 */
public class CustomerList {

    private Customer[] customers; //用来保存客户对象的数组
    private int total; //记录已保存客户对象的数量

    /**
     * 用来初始化Customers数组的构造器
     * @param totalCustomer 指定数组的长度
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     * 将指定的客户添加到数组中
     * @param customer
     * @return true:添加成功 false:添加失败
     */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }
//      customer[total] = customer;
//      total++;
        //或
        customers[total++] = customer;
        return true;
    }

    /**
     * 修改指定索引位置的客户信息
     * @param index
     * @param cust
     * @return true：修改成功 false：修改失败
     */
    public boolean replaceCustomer(int index, Customer cust){
        if(index < 0 || index >= total){//每添加一个客户total都会加一，total的数值总会比数组角标越前一个
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 删除指定索引位置上的客户
     * total用来记录元素个数与最后一个元素角标差1
     * @param index 指定位置的索引值
     * @return  true：删除成功 false：删除失败
     */
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }
        for (int i = index; i < total-1; i++) {//每添加一个客户total都会加一，total的数值总会比数组角标越前一个
            customers[i] = customers[i + 1];
        }
        //最后有数据的元素需要置空
//        customers[total - 1] = null;
//        total--;
        customers[--total] = null;
        return true;
    }

    /**
     * 获取所有客户的信息
      * @return
     */
    public Customer[] getAllCustomers(){
//        return customers; //有些位置上没有添加客户会返回null

        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取指定索引位置上的客户
     * @param index
     * @return 如果找到了元素，则返回，如果没有找到，则返回null
     */
    public Customer getCustomer(int index){
        if(index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    /**
     * 获取存储的客户的数量
     * @return
     */
    public int getTotal(){
        return total;
    }


}
