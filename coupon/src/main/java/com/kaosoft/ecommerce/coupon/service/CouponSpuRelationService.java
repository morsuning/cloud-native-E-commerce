package com.morsuning.ecommerce.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.coupon.entity.CouponSpuRelationEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:41:49
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

