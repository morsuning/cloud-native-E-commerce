package com.morsuning.ecommerce.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.order.entity.OrderItemEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 20:29:06
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

