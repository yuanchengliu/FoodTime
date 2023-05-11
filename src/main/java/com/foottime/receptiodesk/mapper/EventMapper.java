package com.foottime.receptiodesk.mapper;

import com.foottime.receptiodesk.entity.Event;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 官方活动 Mapper 接口
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Mapper
public interface EventMapper extends BaseMapper<Event> {

}
