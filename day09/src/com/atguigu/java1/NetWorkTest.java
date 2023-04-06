package com.atguigu.java1;

/**
 * @author philo
 * @Description
 *
 * >>>接口的应用：代理模式
 *
 * 类似于中介卖房，房源和买家之间没有直接的联系和渠道需要通过中介的管理和服务
 * 或者真实的服务期网络没法直接提供给需要的客户需要像电信，联通等中间代理维持服务
 *
 * @email 3424586889@qq.com
 * @Date 2021-09-22-11:21
 */
public class NetWorkTest {

    public static void main(String[] args) {

        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);

        proxyServer.browse();
    }

}


interface NetWork{

    public void browse();

}

//被代理类
class Server implements NetWork{
    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}

//代理类
class ProxyServer implements NetWork{

    private NetWork work;

    public ProxyServer(NetWork work){
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }

}


