package com.morsuning.ecommerce.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.member.entity.MemberCollectSubjectEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:56:10
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

