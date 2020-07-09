package study.dubbostudy.orderprovider.serviceimpl;

import org.apache.dubbo.config.annotation.Argument;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.config.annotation.Service;
import study.dubbostudy.orderapi.service.OrderService1;
import study.dubbostudy.orderapi.wrapper.DoOrderRequestWrapper;
import study.dubbostudy.orderapi.wrapper.DoOrderResponseWrapper;

/**
 * @author YeHaocong
 * @decription TODO
 * @Date 2020/7/9 20:05
 */

@Service(methods = {@Method(name = "doOrder1",timeout = 5000)})
public class OrderServiceImpl1 implements OrderService1 {
    public DoOrderResponseWrapper doOrder1(DoOrderRequestWrapper param) {
        System.out.println(param.getName() + "创建了新订单1");
        Integer orderId = 101;
        DoOrderResponseWrapper responseWrapper = new DoOrderResponseWrapper();
        responseWrapper.setCode("30000");
        responseWrapper.setData(orderId);
        responseWrapper.setMsg("新建订单1成功");
        return responseWrapper;
    }
}
