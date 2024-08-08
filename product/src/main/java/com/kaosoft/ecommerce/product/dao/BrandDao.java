package com.morsuning.ecommerce.product.dao;

import com.morsuning.ecommerce.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 17:28:30
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
