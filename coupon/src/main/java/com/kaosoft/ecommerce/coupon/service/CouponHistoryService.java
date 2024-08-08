package com.morsuning.ecommerce.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.coupon.entity.CouponHistoryEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:41:49
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

