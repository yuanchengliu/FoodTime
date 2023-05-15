package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonPage;
import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.AddressDTO;
import com.foottime.receptiodesk.dto.LogisticsDTO;
import com.foottime.receptiodesk.dto.NoticeDTO;
import com.foottime.receptiodesk.entity.Official;
import com.foottime.receptiodesk.service.IAddressService;
import com.foottime.receptiodesk.service.ILogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.foottime.receptiodesk.service.IOfficialService;
import com.foottime.receptiodesk.dto.OfficialDTO;
import com.foottime.receptiodesk.service.INoticeService;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/OfficialMassage")
public class OfficialMassage {
    @Autowired(required = false)
    IOfficialService iOfficialService;
    @Autowired(required = false)
    INoticeService iNoticeService;
    @Autowired(required = false)
    IAddressService iAddressService;
    @Autowired
    ILogisticsService iLogisticsService;

    //官方消息
    @GetMapping("/getOfficialMssage")
    public CommonResult<CommonPage<OfficialDTO>> getallmassage(@RequestParam(value = "pageNum",defaultValue = "5") Integer pageNum,
                                                               @RequestParam(value = "pageSize",defaultValue = "1") Integer pageSize,
                                                               @RequestParam(required = false) String searchResults){
    CommonPage<OfficialDTO> page =iOfficialService.getOfficial(pageNum,pageSize,searchResults);
    return CommonResult.success(page);
    }

    //通知消息
    @GetMapping("/getnoticeMassage")
    public CommonResult<CommonPage<NoticeDTO>> getnoticeMassage(@RequestParam(value = "pageNum",defaultValue = "5") Integer pageNum,
                                                                @RequestParam(value = "pageSize",defaultValue = "1") Integer pageSize,
                                                                @RequestParam(required = false) String searchResults){
        CommonPage<NoticeDTO> page = iNoticeService.seleAll(pageNum,pageSize,searchResults);
        return CommonResult.success(page);
    }

    //物流详情
    @GetMapping("/logisticsMassage")
    public CommonResult<CommonPage<AddressDTO>> getlogisticsMassage(@RequestParam(value = "pageNum",defaultValue = "5") Integer pageNum,
                                                                    @RequestParam(value = "pageSize",defaultValue = "1") Integer pageSize,
                                                                    @RequestParam(required = false) String searchResults){
        CommonPage<AddressDTO> page = iOfficialService.seleAllAddress(pageNum,pageSize,searchResults);
        return CommonResult.success(page);
    }


    //确认收货
    @PostMapping("/updateostatus")
    public CommonResult<AddressDTO> updateOstatus(@RequestParam Integer orderid,@RequestParam String ostatus){
        AddressDTO addressDTO = iAddressService.updateOstatus(orderid,ostatus);
        if(addressDTO==null){
            CommonResult.failed();
        }
        return CommonResult.success("收货成功");

    }


    //删除订单
    @PostMapping("/deleorder")
    public CommonResult deleorder(@RequestParam Integer orderid){
        iAddressService.deleOrder(orderid);
        return CommonResult.success("删除成功");
    }

    //延长收货
    @PostMapping("/updatelogistics")
    public CommonResult<CommonPage<LogisticsDTO>> updateTime(@RequestParam Integer orderid, @RequestParam LocalDateTime Time){
        iLogisticsService.updateTime(orderid,Time);
        return CommonResult.success("修改成功");
    }
}
