package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.ShoppingCart;
import com.foottime.receptiodesk.mapper.ShoppingCartMapper;
import com.foottime.receptiodesk.service.IShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-14
 */
@Service
public class ShoppingCartService extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements IShoppingCartService {

}
