package com.morsuning.ecommerce.member.dao;

import com.morsuning.ecommerce.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:56:10
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {

}
