package com.morsuning.ecommerce.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.product.entity.ProductAttrValueEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * spu属性值
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 17:28:30
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

