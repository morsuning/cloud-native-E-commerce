package com.kaosoft.ecommerce.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaosoft.common.utils.PageUtils;
import com.kaosoft.ecommerce.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:41:49
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

