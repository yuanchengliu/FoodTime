package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.Brand;
import com.foottime.receptiodesk.mapper.BrandMapper;
import com.foottime.receptiodesk.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class BrandService extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
