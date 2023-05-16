package com.foottime.receptiodesk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.GoodsinfoDTO;
import com.foottime.receptiodesk.dto.ShowproductlistDTO;
import com.foottime.receptiodesk.entity.Goods;
import com.foottime.receptiodesk.mapper.GoodsMapper;
import com.foottime.receptiodesk.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.foottime.common.StaticConstants.How_many_pieces_of_data;
import static com.foottime.common.StaticConstants.MAGIC_POINT;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class GoodsService extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public CommonPage<GoodsinfoDTO> selectpage(String searchResults, Integer pageNum, Integer pageSize) {
        Page<Goods> page = new Page<>(pageNum, pageSize);
        QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().like(Goods::getGtitle, searchResults);

        goodsMapper.selectPage(page, queryWrapper);
        List<Goods> list = page.getRecords();
        List<GoodsinfoDTO> collect = list.stream().map((item) -> {
            GoodsinfoDTO goodsinfoDTO = new GoodsinfoDTO();
            BeanUtils.copyProperties(item, goodsinfoDTO);
            return goodsinfoDTO;
        }).collect(Collectors.toList());
        CommonPage<GoodsinfoDTO> commonPage = new CommonPage<>();
        commonPage.setPageNum(pageNum);
        commonPage.setPageSize(pageSize);
        commonPage.setTotalPage((int) page.getPages());
        commonPage.setTotal(page.getTotal());
        commonPage.setList(collect);
        return commonPage;
    }

    /**
     SELECT a.`gid`,a.`gtitle`,a.`grice`,a.`sales`, b.`stname`
     FROM goods a,shop b
     WHERE
     a.storeid=b.storeid AND a.`sales`>100
     ORDER BY RAND() LIMIT 0,6
     */

    @Override
    public List<ShowproductlistDTO> selectrecommend() {
        List<ShowproductlistDTO> list = goodsMapper.selectrecommend();
        return list;
    }

    @Override
    public List<ShowproductlistDTO> categoryQueries(String category) {
        List<ShowproductlistDTO> list = goodsMapper.categoryQueries(category);
        return list;
    }

}
