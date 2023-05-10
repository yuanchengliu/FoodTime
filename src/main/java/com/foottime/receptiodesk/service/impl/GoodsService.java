package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.Goods;
import com.foottime.receptiodesk.mapper.GoodsMapper;
import com.foottime.receptiodesk.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class GoodsService extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
