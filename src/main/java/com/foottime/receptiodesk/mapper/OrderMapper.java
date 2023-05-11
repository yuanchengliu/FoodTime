package com.foottime.receptiodesk.mapper;

import com.foottime.receptiodesk.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单信息 Mapper 接口
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
