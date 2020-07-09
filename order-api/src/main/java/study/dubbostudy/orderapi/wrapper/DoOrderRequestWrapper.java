package study.dubbostudy.orderapi.wrapper;

import lombok.Data;

import java.io.Serializable;

/**
 * @author YeHaocong
 * @decription 订单请求信息封装
 * @Date 2020/7/7 19:08
 */

@Data
public class DoOrderRequestWrapper implements Serializable{

    private static final long serialVersionUID = -6533746694955013108L;
    private String name;

}
