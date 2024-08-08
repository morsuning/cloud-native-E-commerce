package com.morsuning.ecommerce.member.dao;

import com.morsuning.ecommerce.member.entity.MemberReceiveAddressEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收货地址
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:56:10
 */
@Mapper
public interface MemberReceiveAddressDao extends BaseMapper<MemberReceiveAddressEntity> {

}
