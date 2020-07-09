package study.dubbostudy.orderprovider;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.dubbostudy.orderprovider.config.DubboConfig;

import java.io.IOException;

/**
 * @author YeHaocong
 * @decription TODO
 * @Date 2020/7/9 20:11
 */

public class AnnotationApp {
    public static void main(String[] args) {
        //使用DubboConfig配置类初始化容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfig.class);
        context.start();
        try {
            //阻塞住进程 实际上有更优雅的方式。
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
