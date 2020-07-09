package study.dubbostudy.orderprovider.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author YeHaocong
 * @decription TODO
 * @Date 2020/7/9 20:12
 */

@Configuration
//设置启动dubbo注解并且设置扫描路径
@EnableDubbo(scanBasePackages = "study.dubbostudy")
//设置dubbo配置
@PropertySource(value = "classpath:/dubbo.properties")
public class DubboConfig {
}
