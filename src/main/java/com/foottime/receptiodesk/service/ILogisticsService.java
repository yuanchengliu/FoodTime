package com.foottime.receptiodesk.service;

import com.foottime.receptiodesk.dto.LogisticsDTO;
import com.foottime.receptiodesk.entity.Logistics;
import com.baomidou.mybatisplus.extension.service.IService;

import java.time.LocalDateTime;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
public interface ILogisticsService extends IService<Logistics> {
    LogisticsDTO updateTime(Integer orderid, LocalDateTime time);
}
