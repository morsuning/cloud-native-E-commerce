package com.morsuning.ecommerce.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.product.entity.AttrGroupEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 属性分组
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 17:28:30
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

