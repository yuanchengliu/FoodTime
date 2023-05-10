package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.Order;
import com.foottime.receptiodesk.mapper.OrderMapper;
import com.foottime.receptiodesk.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单信息 服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class OrderService extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
