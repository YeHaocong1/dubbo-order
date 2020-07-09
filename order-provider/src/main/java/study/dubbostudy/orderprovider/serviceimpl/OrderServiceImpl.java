package study.dubbostudy.orderprovider.serviceimpl;

import study.dubbostudy.orderapi.service.OrderService;
import study.dubbostudy.orderapi.wrapper.DoOrderRequestWrapper;
import study.dubbostudy.orderapi.wrapper.DoOrderResponseWrapper;

import java.util.Random;

/**
 * @author YeHaocong
 * @decription 服务实现类
 */

public class OrderServiceImpl implements OrderService {
    public DoOrderResponseWrapper doOrder(DoOrderRequestWrapper param) {
        System.out.println(param.getName() + "创建了新订单");
        Integer orderId = 100;
        DoOrderResponseWrapper responseWrapper = new DoOrderResponseWrapper();
        responseWrapper.setCode("30000");
        responseWrapper.setData(orderId);
        responseWrapper.setMsg("新建订单成功");
        return responseWrapper;
    }
}
