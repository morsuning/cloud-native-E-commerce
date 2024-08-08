package com.morsuning.ecommerce.coupon.service.impl;

import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.morsuning.ecommerce.coupon.dao.SpuBoundsDao;
import com.morsuning.ecommerce.coupon.entity.SpuBoundsEntity;
import com.morsuning.ecommerce.coupon.service.SpuBoundsService;
import com.morsuning.common.utils.PageUtils;
import com.morsuning.common.utils.Query;


@Service("spuBoundsService")
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsDao, SpuBoundsEntity> implements SpuBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuBoundsEntity> page = this.page(
                new Query<SpuBoundsEntity>().getPage(params),
                new QueryWrapper<SpuBoundsEntity>()
        );

        return new PageUtils(page);
    }

}