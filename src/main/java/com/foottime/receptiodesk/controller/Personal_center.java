package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonPage;
import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.RecipthInformationDTO;
import com.foottime.receptiodesk.service.IReceiptInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
/**
 * 收货信息页面
 */

@RestController
@RequestMapping("/Personal_center")
public class Personal_center {
    @Resource
    IReceiptInformationService iReceiptInformationService;
    /**
     * 模糊查询分页
     * @param val 查询参数
     * @param pageSize 每页条数
     * @param pageNum 当前多少页
     * @return 分页
     */
    @GetMapping("/information")
    public CommonResult<CommonPage<RecipthInformationDTO>> fuzzyqueries(@RequestParam(required = false) String val,
                                                                        @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize,
                                                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

        CommonPage<RecipthInformationDTO> page = iReceiptInformationService.selectLikeAll(val,pageSize,pageNum);
        return CommonResult.success(page);
    }
    /**
     * 增加收货地址信息
     * @param informationDTO 收货人信息
     * @return 添加信息
     */
    @PutMapping("/addpersonal")
    public CommonResult<RecipthInformationDTO> addCustomers(@RequestBody RecipthInformationDTO informationDTO){
        RecipthInformationDTO recipthInformationDTO = iReceiptInformationService.addrecipth(informationDTO);
        if (recipthInformationDTO == null) {
            return CommonResult.failed("该信息已存在");
        }
        return CommonResult.success(informationDTO);
    }
}
