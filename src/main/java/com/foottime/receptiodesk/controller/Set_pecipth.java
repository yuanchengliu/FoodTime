package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonPage;
import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.Recipth_InformationDTO;
import com.foottime.receptiodesk.dto.UserDTO;
import com.foottime.receptiodesk.service.IReceiptInformationService;
import com.foottime.receptiodesk.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
/**
 * 个人中心
 */

@RestController
@RequestMapping("/Personal_center")
public class Set_pecipth {
    @Resource
    IReceiptInformationService iReceiptInformationService;
    @Resource
    IUserService userService;
    /**
     * 模糊查询分页---查询个人收货信息
     * @param val 查询参数
     * @param pageSize 每页条数
     * @param pageNum 当前多少页
     * @return 分页
     */
    @GetMapping("/information")
    public CommonResult<CommonPage<Recipth_InformationDTO>> fuzzyqueries(@RequestParam(required = false) String val,
                                                                         @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize,
                                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

        CommonPage<Recipth_InformationDTO> page = iReceiptInformationService.selectLikeAll(val,pageSize,pageNum);
        return CommonResult.success(page);
    }
    /**
     * 增加收货地址信息
     * @param informationDTO 收货人信息
     * @return 添加信息
     */
    @PutMapping("/addpersonal")
    public CommonResult<Recipth_InformationDTO> addCustomers(@RequestBody Recipth_InformationDTO informationDTO){
        Recipth_InformationDTO recipthInformationDTO = iReceiptInformationService.addrecipth(informationDTO);
        if (recipthInformationDTO == null) {
            return CommonResult.failed("该信息已存在");
        }
        return CommonResult.success(informationDTO);
    }

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
