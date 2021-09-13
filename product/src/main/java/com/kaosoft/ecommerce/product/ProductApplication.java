package com.kaosoft.ecommerce.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 导入 MyBatis-plus
 * 配置数据源
 * 配置 MyBatis-plus
 * mapperScan
 * 映射文件位置
 *
 * @author kaoso
 */
@MapperScan("com.kaosoft.ecommerce.product.dao")
@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
