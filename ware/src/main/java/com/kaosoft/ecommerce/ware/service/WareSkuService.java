package com.morsuning.ecommerce.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.ware.entity.WareSkuEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品库存
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 20:41:39
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

