package com.morsuning.ecommerce.order.service.impl;

import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.morsuning.ecommerce.order.dao.PaymentInfoDao;
import com.morsuning.ecommerce.order.entity.PaymentInfoEntity;
import com.morsuning.ecommerce.order.service.PaymentInfoService;
import com.morsuning.common.utils.PageUtils;
import com.morsuning.common.utils.Query;


@Service("paymentInfoService")
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoDao, PaymentInfoEntity> implements PaymentInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PaymentInfoEntity> page = this.page(
                new Query<PaymentInfoEntity>().getPage(params),
                new QueryWrapper<PaymentInfoEntity>()
        );

        return new PageUtils(page);
    }

}