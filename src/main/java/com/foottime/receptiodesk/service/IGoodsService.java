package com.foottime.receptiodesk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.GoodsinfoDTO;
import com.foottime.receptiodesk.dto.ProductDetailsDTO;
import com.foottime.receptiodesk.dto.ShowproductlistDTO;
import com.foottime.receptiodesk.entity.Goods;

import java.util.List;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
public interface IGoodsService extends IService<Goods> {

    CommonPage<GoodsinfoDTO> selectpage(String searchResults, Integer pageNum, Integer pageSize);


    List<ShowproductlistDTO> selectrecommend();

    List<ShowproductlistDTO> categoryQueries(String category);

    List<ProductDetailsDTO> productDetails(Integer id);

    boolean  addCart(ProductDetailsDTO productDetailsDTO,Integer num);

    boolean subtract(ProductDetailsDTO productDetailsDTO,Integer num);

    List<ProductDetailsDTO> inquireProducts(Integer uid);
}
