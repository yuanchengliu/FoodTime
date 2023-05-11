package com.foottime.receptiodesk.service;

import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.UserRegistration;
import com.foottime.receptiodesk.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户信息 服务类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
public interface IUserService extends IService<User> {

    User login(String uname, Integer upwd);

    boolean register(UserRegistration userRegistration);
}