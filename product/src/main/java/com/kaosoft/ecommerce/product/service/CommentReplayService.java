package com.morsuning.ecommerce.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.product.entity.CommentReplayEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 17:28:30
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

