package com.foottime.receptiodesk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foottime.receptiodesk.dto.LogisticsDTO;
import com.foottime.receptiodesk.entity.Logistics;
import com.foottime.receptiodesk.mapper.LogisticsMapper;
import com.foottime.receptiodesk.service.ILogisticsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
@Service
public class LogisticsService extends ServiceImpl<LogisticsMapper, Logistics> implements ILogisticsService {
        @Autowired(required = false)
        LogisticsMapper logisticsMapper;
        @Autowired(required = false)
        Logistics logistics;
        @Override
        public LogisticsDTO updateTime(Integer orderid, LocalDateTime time){
                Logistics logistics = new Logistics();
                LogisticsDTO logisticsDTO = new LogisticsDTO();
                logistics.setTime(time);
                logisticsMapper.update(logistics,new QueryWrapper<Logistics>().eq("Orderid",orderid));
                return logisticsDTO;
        }
}
