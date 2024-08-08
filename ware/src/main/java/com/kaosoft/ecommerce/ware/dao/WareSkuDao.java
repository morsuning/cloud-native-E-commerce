package com.morsuning.ecommerce.ware.dao;

import com.morsuning.ecommerce.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 20:41:39
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

}
