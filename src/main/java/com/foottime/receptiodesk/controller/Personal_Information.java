package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonPage;
import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.Address_InformationDTO;
import com.foottime.receptiodesk.dto.Forum_InformationDTO;
import com.foottime.receptiodesk.dto.ShouchangDTO;
import com.foottime.receptiodesk.service.IAddressService;
import com.foottime.receptiodesk.service.IForumService;
import com.foottime.receptiodesk.service.IShoucangService;
import com.foottime.receptiodesk.service.IUserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 个人中心--查询我的订单，发表，收藏
 */
@RestController
@RequestMapping("/basic")
@Tag(name="个人中心的")
public class Personal_Information {

    @Resource
    IForumService forumService;

    @Resource
    IUserService userService;

    @Resource
    IAddressService addressService;

    @Resource
    IShoucangService shoucangService;

    /**
     * 个人中心-----个人信息
     *
     */
    @GetMapping("/basic_user")
    public CommonResult CarouselMap(){
        List list = userService.selectuser1();
        return CommonResult.success(list);
    }
    /**
     * 模糊查询分页---查询我的发表
     * @param val 查询参数
     * @param pageSize 每页条数
     * @param pageNum 当前多少页
     * @return 分页
     */
    @GetMapping("/basic_forum")
    public CommonResult<CommonPage<Forum_InformationDTO>> fuzzyqueries(@RequestParam(required = false) String val,
                                                                       @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize,
                                                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

        CommonPage<Forum_InformationDTO> page = forumService.selectforum(val,pageSize,pageNum);
        return CommonResult.success(page);
    }

    /**
     * 模糊查询分页---查询我的订单
     * @param val 查询参数
     * @param pageSize 每页条数
     * @param pageNum 当前多少页
     * @return 分页
     */
    @GetMapping("/basic_address")
    public CommonResult<CommonPage<Address_InformationDTO>> address(@RequestParam(required = false) String val,
                                                                         @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize,
                                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

        CommonPage<Address_InformationDTO> page = addressService.selectaddress(val,pageSize,pageNum);
        return CommonResult.success(page);
    }

    /**
     * 模糊查询分页---查询我的订单
     * @param val 查询参数
     * @param pageSize 每页条数
     * @param pageNum 当前多少页
     * @return 分页
     */
    @GetMapping("/basic_shouchang")
    public CommonResult<CommonPage<ShouchangDTO>> shouchang(@RequestParam(required = false) String val,
                                                            @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize,
                                                            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {

        CommonPage<ShouchangDTO> page = shoucangService.selectshoucang(val,pageSize,pageNum);
        return CommonResult.success(page);
    }
}
