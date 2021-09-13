package com.kaosoft.ecommerce.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaosoft.ecommerce.product.entity.BrandEntity;
import com.kaosoft.ecommerce.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("Test");
        brandEntity.setName("kaoso");
        brandService.save(brandEntity);
        System.out.println("已保存");

        final List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brand_id.forEach((item) -> {
            System.out.println(item);
        });
    }

}
