package com.morsuning.ecommerce.coupon.service.impl;

import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.morsuning.ecommerce.coupon.dao.HomeSubjectSpuDao;
import com.morsuning.ecommerce.coupon.entity.HomeSubjectSpuEntity;
import com.morsuning.ecommerce.coupon.service.HomeSubjectSpuService;
import com.morsuning.common.utils.PageUtils;
import com.morsuning.common.utils.Query;


@Service("homeSubjectSpuService")
public class HomeSubjectSpuServiceImpl extends ServiceImpl<HomeSubjectSpuDao, HomeSubjectSpuEntity> implements HomeSubjectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeSubjectSpuEntity> page = this.page(
                new Query<HomeSubjectSpuEntity>().getPage(params),
                new QueryWrapper<HomeSubjectSpuEntity>()
        );

        return new PageUtils(page);
    }

}