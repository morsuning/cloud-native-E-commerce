package com.kaosoft.ecommerce.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaosoft.common.utils.PageUtils;
import com.kaosoft.ecommerce.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 17:28:30
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

