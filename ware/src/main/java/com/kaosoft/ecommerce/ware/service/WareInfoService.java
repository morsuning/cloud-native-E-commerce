package com.morsuning.ecommerce.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.morsuning.ecommerce.ware.entity.WareInfoEntity;
import com.morsuning.common.utils.PageUtils;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 20:41:39
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

