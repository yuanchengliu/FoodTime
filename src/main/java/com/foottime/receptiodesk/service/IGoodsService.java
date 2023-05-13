package com.foottime.receptiodesk.service;

import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.GoodsinfoDTO;
import com.foottime.receptiodesk.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;

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

}
