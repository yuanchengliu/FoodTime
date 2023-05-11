package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.UserLogin;
import com.foottime.receptiodesk.dto.UserRegistration;
import com.foottime.receptiodesk.entity.User;
import com.foottime.receptiodesk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Personal")
public class Personal {
    @Autowired
    IUserService userService;

    /**
     * 登录
     * @param userLogin
     * @return
     */
    @PostMapping("/login")
    public CommonResult login(@RequestBody UserLogin userLogin){
        User login = userService.login(userLogin.getUname(),userLogin.getUpwd());
        if (login == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        return CommonResult.success(login);
    }

    /**
     * 注册
     * @param userRegistration
     * @return
     */
    @PostMapping("/User_Registration")
    public CommonResult Registration(@RequestBody UserRegistration userRegistration){
        boolean user = userService.register(userRegistration);
        if (!user) {
            return CommonResult.failed("注册失败");
        }
        return CommonResult.success("注册成功");
    }
}
