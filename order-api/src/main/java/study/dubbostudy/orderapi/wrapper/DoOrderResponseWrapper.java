package study.dubbostudy.orderapi.wrapper;

import lombok.Data;

import java.io.Serializable;

/**
 * @author YeHaocong
 * @decription 订单响应信息封装
 */

@Data
public class DoOrderResponseWrapper implements Serializable{
    private static final long serialVersionUID = 4394683875581642922L;
    private String code;

    private Object data;

    private String msg;

}
