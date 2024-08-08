package com.morsuning.ecommerce.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.product.entity.AttrAttrgroupRelationEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 17:28:30
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

