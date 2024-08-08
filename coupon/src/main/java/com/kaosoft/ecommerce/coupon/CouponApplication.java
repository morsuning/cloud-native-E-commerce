package com.morsuning.ecommerce.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用 nacos 作为配置中心
 * 1. 引入依赖
 * 2. 创建一个 bootstrap.properties
 * 3. 在配置中心设置一个默认配置名字为当前应用名.properties
 * 4. 在其中添加配置
 * 5. 动态刷新配置
 * @RefreshScope
 * @Value("${配置项名称}")
 * 如果和本地有相同配置，优先远程
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class, args);
    }

}
