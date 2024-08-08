package com.morsuning.ecommerce.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.coupon.entity.CouponEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:41:49
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

