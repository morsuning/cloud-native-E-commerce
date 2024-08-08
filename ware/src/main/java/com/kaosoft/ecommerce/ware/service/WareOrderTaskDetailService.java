package com.morsuning.ecommerce.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.ware.entity.WareOrderTaskDetailEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 20:41:39
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

