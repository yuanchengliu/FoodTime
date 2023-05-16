package com.foottime.receptiodesk.service;

import com.foottime.receptiodesk.dto.UserDTO;
import com.foottime.receptiodesk.dto.UserRegistrationDTO;
import com.foottime.receptiodesk.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

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

    boolean register(UserRegistrationDTO userRegistrationDTO);


    /**
     * 根据id修改用户信息
     * @param uid 用户id
     * @param userDTO 客户信息
     * @return 修改提示
     */
    boolean updateBid(Integer uid, UserDTO userDTO);


    /**
     * 设置---查询用户信息
     */
  List selectuser();
}
