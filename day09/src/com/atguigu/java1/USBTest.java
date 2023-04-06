package com.atguigu.java1;

/**
 * @author philo
 * @Description
 *
 * 接口的使用
 * 1.接口使用上也满足多态性
 *
 * 2.接口，实际上就是定义了一种规范  定义了类的规范
 *
 * 3.开发中，体会面向接口编程！
 *
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-22-11:21
 */
public class USBTest {

    public static void main(String[] args) {

        Computer com = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);

        //2. 创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());

        //3. 创建了接口的匿名实现类的非匿名对象
        //对象名叫phone，没有类名用接口名USB暂时充当
        USB phone = new USB() {//接口名USB暂时充当匿名的实现类名，实现类要覆盖（实现）接口中所有的抽象方法
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        com.transferData(phone);

        //4. 创建了接口的匿名实现类的匿名对象
        //没有对象名直接放实现类的构造器，没有实现类的类名用接口名暂时充当，实现类要覆盖（实现）接口中的所有的抽象方法
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("mp3结束工作");
            }
        });

    }

}

class Computer{

    public void transferData(USB usb){//USB usb = new Flash();
        //USB没法造对象，参数放入USB这个接口实现类的对象
        usb.start();

        System.out.println("具体传输数据的细节");

        usb.stop();
    }

}

interface USB{
    //常量：定义了长、宽、最大最小的传输速度等

    void start();

    void stop();

}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }

}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }

}