package com.foottime.receptiodesk.controller;

import com.foottime.common.CommonResult;
import com.foottime.receptiodesk.dto.ProductDetailsDTO;
import com.foottime.receptiodesk.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Cart")
public class CartController {

    @Autowired
    IGoodsService goodsService;

    /**
     * 加入购物车
     * @param productDetailsDTO
     * @return
     */
    @GetMapping("/add")
    public CommonResult addcart(@RequestBody ProductDetailsDTO productDetailsDTO, @RequestParam Integer num) {
        boolean b = goodsService.addCart(productDetailsDTO,num);
        if (!b) {
            return CommonResult.failed("添加失败，请重试！");
        }
        return CommonResult.success("添加成功");
    }

    /**
     * 移除商品
     * @param productDetailsDTO
     * @param num
     * @return
     */

    @GetMapping("/subtract")
    public CommonResult subtract(@RequestBody ProductDetailsDTO productDetailsDTO,@RequestParam Integer num) {
        boolean subtract = goodsService.subtract(productDetailsDTO, num);
        if (subtract){
            return CommonResult.success("移除成功");
        }
        return CommonResult.failed("移除失败");
    }


    @GetMapping("/Inquire_products")
    public CommonResult inquireProducts(@RequestParam Integer uid){
        List<ProductDetailsDTO> list = goodsService.inquireProducts(uid);
        return CommonResult.success(list);
    }
}
