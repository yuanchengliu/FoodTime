package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.UserDTO;
import com.foottime.receptiodesk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 基本信息页面
 */
@RestController
@RequestMapping("/basic")
public class Basic_information {
    @Autowired
    IUserService userService;
    /**
     * 根据id修改用户信息
     * @param uid 用户id
     * @param userDTO 客户信息
     * @return 修改提示
     */
    @PostMapping("/update")
    public CommonResult<UserDTO> update(@RequestParam Integer uid, @RequestBody UserDTO userDTO){
        boolean update = userService.updateBid(uid, userDTO);
        if (!update){
            return CommonResult.failed();
        }
        return CommonResult.success("修改成功");
    }
}
