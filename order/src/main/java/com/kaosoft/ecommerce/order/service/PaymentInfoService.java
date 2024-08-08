package com.morsuning.ecommerce.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.order.entity.PaymentInfoEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 20:29:06
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

