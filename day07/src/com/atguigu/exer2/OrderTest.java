package com.atguigu.exer2;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-19-9:29
 */
public class OrderTest {

    public static void main(String[] args) {

        Order order1 = new Order(1001 , "AA");
        Order order2 = new Order(1002 , "BB");
        System.out.println(order1.equals(order2));

        Order order3 = new Order(1002 , "BB");
        System.out.println(order2.equals(order3));

    }
}


class Order{

    private int orderId;
    private String orderName;
    //假设Order类中还有一个自定义类Customer如果要比较Order类的对象是否相同需要调用equals方法
    //比较过程中当然也要比较对象的Customer类的内容是否相同，所以Customer类中也要重写equals方法
    //不然Customer类中的equals方法调用的还是Object类中的equals的方法

    public Order(int orderId, String orderName){
        super();
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Order){
            Order order = (Order) obj;
            //正确的
            return this.orderId == order.orderId &&
                    this.orderName.equals(order.orderName);
            //orderName 是个String类型的数据可以调用String类型中的
            //equals方法比较字符串的不同
            //错误的
//			return this.orderId == order.orderId &&
//					this.orderName == order.orderName;
        }
        return false;
    }

}