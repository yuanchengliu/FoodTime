package com.foottime.receptiodesk.service.impl;


import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.GoodsinfoDTO;
import com.foottime.receptiodesk.dto.ProductDetailsDTO;
import com.foottime.receptiodesk.dto.ShowproductlistDTO;
import com.foottime.receptiodesk.entity.Goods;
import com.foottime.receptiodesk.mapper.GoodsMapper;
import com.foottime.receptiodesk.service.IGoodsService;
import org.springframework.beans.BeanUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    @Resource
    GoodsMapper goodsMapper;

    @Resource
    StringRedisTemplate stringRedisTemplate;

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
     * SELECT a.`gid`,a.`gtitle`,a.`grice`,a.`sales`, b.`stname`
     * FROM goods a,shop b
     * WHERE
     * a.storeid=b.storeid AND a.`sales`>100
     * ORDER BY RAND() LIMIT 0,6
     */

    @Override
    public List<ShowproductlistDTO> selectrecommend() {

        return goodsMapper.selectrecommend();
    }

    @Override
    public List<ShowproductlistDTO> categoryQueries(String category) {
        return goodsMapper.categoryQueries(category);
    }

    @Override
    public List<ProductDetailsDTO> productDetails(Integer id) {
        return goodsMapper.productDetails(id);
    }

    @Override
    public boolean addCart(ProductDetailsDTO productDetailsDTO, Integer num) {

        int uid = 1123;
        String key = "Cart" + uid;

        //遍历redis所有列表
        Set<String> range = stringRedisTemplate.opsForZSet().range(key, 0, -1);

        assert range != null;
        for (String s : range) {
            //赋值
            ProductDetailsDTO toBean = JSONUtil.toBean(s, ProductDetailsDTO.class);
            //判断有没有这条数据
            if (toBean.getQid().equals(productDetailsDTO.getQid())) {
                stringRedisTemplate.opsForZSet().remove(key, JSONUtil.toJsonStr(productDetailsDTO));
                stringRedisTemplate.opsForZSet().remove(key, JSONUtil.toJsonStr(toBean));
                // 如果购物车里已经有了这件商品
                //获取这件商品的score，与传入的num比较
                ProductDetailsDTO detailsDTO = new ProductDetailsDTO();
                BeanUtils.copyProperties(toBean, detailsDTO);
                detailsDTO.setInnum(productDetailsDTO.getInnum());
                BeanUtils.copyProperties(detailsDTO, toBean);
                stringRedisTemplate.opsForZSet().add(key, JSONUtil.toJsonStr(toBean), 1);

//                Double score = stringRedisTemplate.opsForZSet().score(key, JSONUtil.toJsonStr(toBean));
//                int i = (int) (num - score);
//                // 如果传入的值大于原有的score的值，就+i 反之一样
//                if (i > 0)
//                    stringRedisTemplate.opsForZSet().incrementScore(key, JSONUtil.toJsonStr(productDetailsDTO), i);
                return true;
            }
        }
        stringRedisTemplate.opsForZSet().add(key, JSONUtil.toJsonStr(productDetailsDTO), 1);
        return false;
    }

    /**
     * 待
     * @param productDetailsDTO
     * @param num
     * @return
     */
    @Override
    public boolean subtract(ProductDetailsDTO productDetailsDTO, Integer num) {
//        User user = new User();
//        Integer uid = user.getUid();
        int uid = 1123;
        String key = "Cart" + uid;

//        Set<String> range = stringRedisTemplate.opsForZSet().range(key, 0, -1);
//
//        assert range != null;
//        for (String s : range) {
//            ProductDetailsDTO toBean = JSONUtil.toBean(s, ProductDetailsDTO.class);
//            Double score = stringRedisTemplate.opsForZSet().score(key, JSONUtil.toJsonStr(toBean));
//            if (toBean.getQid().equals(productDetailsDTO.getQid())) {
//                if (num - score < 0) {
//
//                    stringRedisTemplate.opsForZSet().incrementScore(key, JSONUtil.toJsonStr(productDetailsDTO), -num);
//                    return true;
//                }
//                stringRedisTemplate.opsForZSet().remove(key, JSONUtil.toJsonStr(toBean));
//                return true;
//            }
//        }
//        return false;
        //遍历redis所有列表
        Set<String> range = stringRedisTemplate.opsForZSet().range(key, 0, -1);
        assert range != null;
        for (String s : range) {
            ProductDetailsDTO toBean = JSONUtil.toBean(s, ProductDetailsDTO.class);
            if (num == 1) {
                if (toBean.getQid().equals(productDetailsDTO.getQid())) {
                    stringRedisTemplate.opsForZSet().remove(key, JSONUtil.toJsonStr(toBean));
                    return true;
                }
                return false;
            }
            else {
                stringRedisTemplate.delete(key);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<ProductDetailsDTO> inquireProducts(Integer uid) {
        String key = "Cart" + uid;
        Set<String> range = stringRedisTemplate.opsForZSet().range(key, 0, -1);
//        assert range != null;
//        for (String s : range) {
//
//            ProductDetailsDTO productDetailsDTO = new ProductDetailsDTO();
//
//            ProductDetailsDTO toBean = JSONUtil.toBean(s, ProductDetailsDTO.class);
//            Double score = stringRedisTemplate.opsForZSet().score(key, JSONUtil.toJsonStr(toBean));
//            System.out.println(score);
//            productDetailsDTO.setInnum(score);
//
//            return toBean;
//        }
        List<ProductDetailsDTO> collect = range.stream().map(item -> {
            ProductDetailsDTO productDetailsDTO = new ProductDetailsDTO();
            ProductDetailsDTO toBean = JSONUtil.toBean(item, ProductDetailsDTO.class);
            BeanUtils.copyProperties(toBean,productDetailsDTO);
            return productDetailsDTO;
        }).collect(Collectors.toList());

        return collect;
    }


}
