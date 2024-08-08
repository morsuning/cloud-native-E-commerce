package com.morsuning.ecommerce.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.coupon.entity.MemberPriceEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:41:49
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

