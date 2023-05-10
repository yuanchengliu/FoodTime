package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.User;
import com.foottime.receptiodesk.mapper.UserMapper;
import com.foottime.receptiodesk.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {

}
