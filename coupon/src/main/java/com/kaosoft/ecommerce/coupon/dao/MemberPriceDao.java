package com.kaosoft.ecommerce.coupon.dao;

import com.kaosoft.ecommerce.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:41:49
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
