package com.atguigu.exer3;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-25-15:53
 */
public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius){
        super(radius);
    }

    @Override
    public int compareTo(Object o){
        if(this == o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
            //错误的：
//			return (int) (this.getRadius() - c.getRadius());//返回的不是基本数据类型  有漏洞假设差值是0.3会返回0二者相等不符合逻辑
            //正确的方式一：
//            if(this.getRadius() > c.getRadius()){
//                return 1;
//            }else if(this.getRadius() < c.getRadius()){
//                return -1;
//            }else{
//                return 0;
//            }
            //当属性radius声明为Double类型时，可以调用包装类的方法 Double类实现了Compareable接口并重写了compareTo方法
            //正确的方式二：
            return this.getRadius().compareTo(c.getRadius());
        }else{
//            return -1;
            throw new RuntimeException("传入的数据类型不匹配");
        }

    }

}
