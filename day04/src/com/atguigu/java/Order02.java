package com.atguigu.java;

/**
 * @author philo
 * @Description
 *
 * >>>>>权限修饰符测试
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-12-9:20
 */
public class Order02 {

    private int orderPrivate; //私有属性

    int orderDefault; //缺省属性

    public int orderPublic; //公共属性


    //私有方法
    private void methodPrivate() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    //缺省方法
    void methodDefault() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    //公共方法
    public void methodPublic() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
}
