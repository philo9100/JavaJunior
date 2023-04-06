package com.atguigu.exer3;

/**
 * @author philo
 * @Description
 *
 * interface CompareObject{
 * 	public int compareTo(Object o);
 * 	//若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
 *  }
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-25-15:50
 */
public interface CompareObject {

    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);

}
