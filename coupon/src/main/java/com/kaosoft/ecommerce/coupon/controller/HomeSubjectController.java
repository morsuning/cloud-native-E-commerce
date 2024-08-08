package com.morsuning.ecommerce.coupon.controller;

import com.morsuning.ecommerce.coupon.entity.HomeSubjectEntity;
import com.morsuning.ecommerce.coupon.service.HomeSubjectService;
import com.morsuning.common.utils.PageUtils;
import com.morsuning.common.utils.R;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author morsuning
 * @email morsuning@gmail.com
 * @date 2021-09-13 19:41:49
 */
@RestController
@RequestMapping("coupon/homesubject")
public class HomeSubjectController {
    @Autowired
    private HomeSubjectService homeSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = homeSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        HomeSubjectEntity homeSubject = homeSubjectService.getById(id);

        return R.ok().put("homeSubject", homeSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HomeSubjectEntity homeSubject) {
        homeSubjectService.save(homeSubject);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HomeSubjectEntity homeSubject) {
        homeSubjectService.updateById(homeSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        homeSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
