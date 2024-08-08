package com.morsuning.ecommerce.order.dao;

import com.morsuning.ecommerce.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 20:29:06
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
