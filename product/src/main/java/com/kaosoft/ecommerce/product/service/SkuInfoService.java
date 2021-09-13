package com.kaosoft.ecommerce.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaosoft.common.utils.PageUtils;
import com.kaosoft.ecommerce.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 17:28:30
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

