package com.foottime.receptiodesk.mapper;

import com.foottime.receptiodesk.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息 Mapper 接口
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
