package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonPage;
import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.GoodsinfoDTO;
import com.foottime.receptiodesk.dto.ProductDetailsDTO;
import com.foottime.receptiodesk.dto.ShowproductlistDTO;
import com.foottime.receptiodesk.service.IAdverimagesService;
import com.foottime.receptiodesk.service.ICategoryService;
import com.foottime.receptiodesk.service.IFenleioneService;
import com.foottime.receptiodesk.service.IGoodsService;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import static com.foottime.common.StaticConstants.How_many_pieces_of_data;
import static com.foottime.common.StaticConstants.MAGIC_POINT;

@RestController
@Tag(name="首页")
@RequestMapping("/Index")
public class Index {
    @Autowired
    IGoodsService goodsService;
    @Autowired
    IAdverimagesService adverimagesService;

    @Autowired
    ICategoryService categoryService;

    @Autowired
    IFenleioneService fenleioneService;

    /**
     * 轮播图
     *
     * @return
     */
    @GetMapping("/Carousel_map")
    public CommonResult CarouselMap() {
        List list = adverimagesService.selectCarouselMap();
        return CommonResult.success(list);
    }

    /**
     * 搜索分页
     *
     * @param SearchResults
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/Search")
    public CommonResult<CommonPage<GoodsinfoDTO>> Search(@RequestParam String SearchResults,
                                                         @RequestParam(value = "pageNum", defaultValue = MAGIC_POINT) Integer pageNum,
                                                         @RequestParam(value = "pageSize", defaultValue = How_many_pieces_of_data) Integer pageSize) {
        CommonPage<GoodsinfoDTO> page = goodsService.selectpage(SearchResults, pageNum, pageSize);
        return CommonResult.success(page);
    }

    /**
     * 每日推荐
     *
     * @return
     */
    @GetMapping("/Recommend")
    public CommonResult recommend() {
        List<ShowproductlistDTO> list = goodsService.selectrecommend();
        return CommonResult.success(list);
    }

    /**
     * 根据分类查询商品
     *
     * @param category
     * @return
     */
    @GetMapping("/Category_queries")
    public CommonResult CategoryQueries(@RequestParam String category) {
        List<ShowproductlistDTO> list = goodsService.categoryQueries(category);
        return CommonResult.success(list);
    }


    /**
     * 商品详情
     * @param id
     * @return
     */
    @GetMapping("/Product_details")
    public CommonResult ProductDetails(@RequestParam Integer id) {
        List<ProductDetailsDTO> dtoList = goodsService.productDetails(id);
        return CommonResult.success(dtoList);
    }


}
