package com.morsuning.ecommerce.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.morsuning.ecommerce.product.dao.SpuImagesDao;
import com.morsuning.ecommerce.product.entity.SpuImagesEntity;
import com.morsuning.ecommerce.product.service.SpuImagesService;
import com.morsuning.common.utils.PageUtils;
import com.morsuning.common.utils.Query;


@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity> implements SpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuImagesEntity> page = this.page(
                new Query<SpuImagesEntity>().getPage(params),
                new QueryWrapper<SpuImagesEntity>()
        );

        return new PageUtils(page);
    }

}