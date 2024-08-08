package com.morsuning.ecommerce.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.order.entity.OrderOperateHistoryEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 20:29:06
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

