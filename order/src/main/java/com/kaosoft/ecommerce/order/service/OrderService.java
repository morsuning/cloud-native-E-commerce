package com.kaosoft.ecommerce.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaosoft.common.utils.PageUtils;
import com.kaosoft.ecommerce.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author kaoso
 * @email morsuning@gmail.com
 * @date 2021-09-13 20:29:06
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

