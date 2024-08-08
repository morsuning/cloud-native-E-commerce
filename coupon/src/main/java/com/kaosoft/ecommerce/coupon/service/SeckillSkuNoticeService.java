package com.morsuning.ecommerce.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.coupon.entity.SeckillSkuNoticeEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:41:49
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

