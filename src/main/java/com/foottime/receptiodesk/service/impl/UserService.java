package com.foottime.receptiodesk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.UserRegistration;
import com.foottime.receptiodesk.entity.User;
import com.foottime.receptiodesk.mapper.UserMapper;
import com.foottime.receptiodesk.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

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

    @Autowired
    UserMapper userMapper;


    @Override
    public User login(String uname, Integer upwd) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(User::getUname,uname)
                .eq(User::getUpwd,upwd);
        User one = getOne(queryWrapper);
        return one;
    }

    @Override
    public boolean register(UserRegistration userRegistration) {
        String uname = userRegistration.getUname();
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(User::getUname,uname);
        User one = getOne(wrapper);
        if (one==null){
            User user = new User();
            BeanUtils.copyProperties(userRegistration,user);
            int insert = userMapper.insert(user);
            return insert > 0;
        }
        return false;
    }
}
