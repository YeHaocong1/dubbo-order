package study.dubbostudy.orderapi.service;

import study.dubbostudy.orderapi.wrapper.DoOrderRequestWrapper;
import study.dubbostudy.orderapi.wrapper.DoOrderResponseWrapper;

/**
 * @author YeHaocong
 * @decription 订单业务接口
 */

public interface OrderService {

    DoOrderResponseWrapper doOrder(DoOrderRequestWrapper param);
}
