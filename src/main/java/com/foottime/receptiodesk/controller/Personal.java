package com.foottime.receptiodesk.controller;

import cn.hutool.json.JSONUtil;
import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.UserLoginDTO;
import com.foottime.receptiodesk.dto.UserRegistrationDTO;
import com.foottime.receptiodesk.entity.User;
import com.foottime.receptiodesk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/Personal")
public class Personal {
    @Autowired
    IUserService userService;

    /**
     * 登录
     * @param userLoginDTO
     * @return
     */
    @PostMapping("/login")
    public CommonResult login(@RequestBody UserLoginDTO userLoginDTO){
        User login = userService.login(userLoginDTO.getUname(), userLoginDTO.getUpwd());
        if (login == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }

        return CommonResult.success(login);
    }

    /**
     * 注册
     * @param userRegistrationDTO
     * @return
     */
    @PostMapping("/User_Registration")
    public CommonResult Registration(@RequestBody UserRegistrationDTO userRegistrationDTO){
        boolean user = userService.register(userRegistrationDTO);
        if (!user) {
            return CommonResult.failed("注册失败");
        }
        return CommonResult.success("注册成功");
    }
}
