package com.kaosoft.ecommerce.member.feign;

import com.kaosoft.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 1. 引入 OpenFeign
 * 2. 编写接口，告诉 SpringCloud 该接口要调用远程服务
 *  声明接口的每一个方法都是调用远程远程服务的哪个请求
 * 3. 开启远程调用功能
 * @Author xuechenyang(morsuning @ gmail.com)
 * @Date 2021/9/13 22:36
 */
@FeignClient("coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/list")
    public R memberCoupons();
}
