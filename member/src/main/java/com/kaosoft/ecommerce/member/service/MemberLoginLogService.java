package com.morsuning.ecommerce.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.member.entity.MemberLoginLogEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:56:10
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

