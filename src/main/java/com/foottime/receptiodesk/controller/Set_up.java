package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.service.IUserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 设置页面
 */
@RestController
@Tag(name="设置页面--个人信息")
@RequestMapping("/setup")
public class Set_up {
    @Autowired
    IUserService userService;
    /**
     * 设置页面-----个人信息
     *
     */
    @GetMapping("/setup_user")
    public CommonResult CarouselMap(){
        List list = userService.selectuser();
        return CommonResult.success(list);
    }
}
