package study.dubbostudy.orderprovider;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import study.dubbostudy.orderapi.service.OrderService1;
import study.dubbostudy.orderprovider.serviceimpl.OrderServiceImpl1;

import java.io.IOException;

/**
 * @author YeHaocong
 * @decription TODO
 * @Date 2020/7/10 15:20
 */

public class APIAPP {
    public static void main(String[] args) {
        //创建服务实现类实例
        OrderService1 orderService = new OrderServiceImpl1();
        //创建一个Application配置
        ApplicationConfig config = new ApplicationConfig();
        //设置name属性和owner属性
        config.setName("order-providerAPI");
        config.setOwner("YeHaocongAPI");


        //创建一个注册中心配置
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("192.168.18.137:2181");


        //创建一个服务发布协议配置
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);


        //创建一个服务配置
        ServiceConfig<OrderService1> service = new ServiceConfig<OrderService1>();
        //设置服务接口
        service.setInterface(OrderService1.class);
        //设置服务Application配置
        service.setApplication(config);

        //设置服务注册中心
        service.setRegistry(registryConfig);
        //设置服务的实现类
        service.setRef(orderService);

        //发布服务
        service.export();

        try {
            //阻塞主线程
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
