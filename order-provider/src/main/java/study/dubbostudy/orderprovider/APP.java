package study.dubbostudy.orderprovider;


import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.container.Main;
import study.dubbostudy.orderapi.service.OrderService;
import study.dubbostudy.orderapi.service.OrderService1;
import study.dubbostudy.orderprovider.serviceimpl.OrderServiceImpl;
import study.dubbostudy.orderprovider.serviceimpl.OrderServiceImpl1;

/**
 * @author YeHaocong
 * @decription 服务提供者启动类
 */

public class APP {
    public static void main(String[] args) {

        Main.main(args);

    }
}
