package com.morsuning.ecommerce.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.coupon.entity.SpuBoundsEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:41:48
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

