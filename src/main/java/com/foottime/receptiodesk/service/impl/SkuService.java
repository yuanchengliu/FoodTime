package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.Sku;
import com.foottime.receptiodesk.mapper.SkuMapper;
import com.foottime.receptiodesk.service.ISkuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表SKU 服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class SkuService extends ServiceImpl<SkuMapper, Sku> implements ISkuService {

}
