package com.kaosoft.ecommerce.coupon.dao;

import com.kaosoft.ecommerce.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:41:49
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

}
