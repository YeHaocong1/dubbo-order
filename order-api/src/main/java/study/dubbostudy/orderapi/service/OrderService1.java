package study.dubbostudy.orderapi.service;

import study.dubbostudy.orderapi.wrapper.DoOrderRequestWrapper;
import study.dubbostudy.orderapi.wrapper.DoOrderResponseWrapper;

/**
 * @author YeHaocong
 * @decription TODO
 * @Date 2020/7/9 20:05
 */

public interface OrderService1 {
    DoOrderResponseWrapper doOrder1(DoOrderRequestWrapper param);
}
