package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.Event;
import com.foottime.receptiodesk.mapper.EventMapper;
import com.foottime.receptiodesk.service.IEventService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 官方活动 服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class EventService extends ServiceImpl<EventMapper, Event> implements IEventService {

}
