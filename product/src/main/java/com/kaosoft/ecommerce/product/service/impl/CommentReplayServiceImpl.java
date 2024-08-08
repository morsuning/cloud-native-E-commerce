package com.morsuning.ecommerce.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.morsuning.ecommerce.product.dao.CommentReplayDao;
import com.morsuning.ecommerce.product.entity.CommentReplayEntity;
import com.morsuning.ecommerce.product.service.CommentReplayService;
import com.morsuning.common.utils.PageUtils;
import com.morsuning.common.utils.Query;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}