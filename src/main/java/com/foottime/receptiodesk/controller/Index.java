package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonPage;
import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.GoodsinfoDTO;
import com.foottime.receptiodesk.service.IAdverimagesService;
import com.foottime.receptiodesk.service.IGoodsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.foottime.common.StaticConstants.How_many_pieces_of_data;
import static com.foottime.common.StaticConstants.MAGIC_POINT;

@RestController
@RequestMapping("/Index")
public class Index {
    @Autowired
    IGoodsService goodsService;
    @Autowired
    IAdverimagesService adverimagesService;

    /**
     * 轮播图
     * @return
     */
    @GetMapping("/Carousel_map")
    public CommonResult CarouselMap(){
       List list = adverimagesService.selectCarouselMap();
        return CommonResult.success(list);
    }

    /**
     * 搜索分页
     * @param SearchResults
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/Search")
    public CommonResult<CommonPage<GoodsinfoDTO>> Search(@RequestParam String SearchResults,
                                           @RequestParam(value = "pageNum", defaultValue = MAGIC_POINT) Integer pageNum,
                                           @RequestParam(value = "pageSize", defaultValue = How_many_pieces_of_data) Integer pageSize){
        CommonPage<GoodsinfoDTO> page = goodsService.selectpage(SearchResults,pageNum,pageSize);
        return CommonResult.success(page);
    }
}
