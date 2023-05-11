package com.foottime.receptiodesk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foottime.receptiodesk.entity.Adverimages;
import com.foottime.receptiodesk.mapper.AdverimagesMapper;
import com.foottime.receptiodesk.service.IAdverimagesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class AdverimagesService extends ServiceImpl<AdverimagesMapper, Adverimages> implements IAdverimagesService {


    @Override
    public List selectCarouselMap() {
        QueryWrapper<Adverimages> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("SELECT imageid,imageurl FROM adverimages ORDER BY RAND() LIMIT 0,4;");
        List<Adverimages> list = list(queryWrapper);
        return list;
    }
}
