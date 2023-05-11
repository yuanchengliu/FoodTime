package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.service.impl.AdverimagesService;
import com.foottime.receptiodesk.service.impl.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Index")
public class Index {
    @Autowired
    GoodsService goodsService;
    @Autowired
    AdverimagesService adverimagesService;

    /**
     * 轮播图
     * @return
     */
    @GetMapping("/Carousel_map")
    public CommonResult Carousel_map(){
       List list = adverimagesService.selectCarouselMap();
        return CommonResult.success(list);
    }

}
