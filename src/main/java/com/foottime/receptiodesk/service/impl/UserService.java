package com.foottime.receptiodesk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foottime.receptiodesk.dto.UserDTO;
import com.foottime.receptiodesk.dto.UserRegistrationDTO;
import com.foottime.receptiodesk.entity.Adverimages;
import com.foottime.receptiodesk.entity.User;
import com.foottime.receptiodesk.mapper.UserMapper;
import com.foottime.receptiodesk.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    public boolean register(UserRegistrationDTO userRegistrationDTO) {
        String uname = userRegistrationDTO.getUname();
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(User::getUname,uname);
        User one = getOne(wrapper);
        if (one==null){
            User user = new User();
            BeanUtils.copyProperties(userRegistrationDTO,user);
            int insert = userMapper.insert(user);
            return insert > 0;
        }
        return false;
    }
    /**
     * 根据id修改用户信息
     * @param uid 用户id
     * @param userDTO 客户信息
     * @return 修改提示
     */
    @Override
    public boolean updateBid(Integer uid, UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);
        user.setUid(uid);
        return updateById(user);
    }

    /**
     * 设置---查询用户信息
     */
    @Override
    public List selectuser() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("upicture","unickname","uname");
        List<User> list = list(queryWrapper);
        return list;
    }
    /**
     * 个人中心---查询用户信息
     */
    @Override
    public List selectuser1() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("upicture","unickname");
        List<User> list = list(queryWrapper);
        return list;
    }
}
