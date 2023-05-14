package com.foottime.receptiodesk.mapper;

import com.foottime.receptiodesk.dto.ProductDetailsDTO;
import com.foottime.receptiodesk.dto.ShowproductlistDTO;
import com.foottime.receptiodesk.entity.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品信息 Mapper 接口
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {

    List<ShowproductlistDTO> selectrecommend();

    List<ShowproductlistDTO> categoryQueries(String category);

    List<ProductDetailsDTO> productDetails(Integer id);

}
