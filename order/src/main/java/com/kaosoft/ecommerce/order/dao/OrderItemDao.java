package com.morsuning.ecommerce.order.dao;

import com.morsuning.ecommerce.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 20:29:06
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
