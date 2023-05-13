package com.foottime.receptiodesk.service;

import com.foottime.receptiodesk.entity.Adverimages;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
public interface IAdverimagesService extends IService<Adverimages> {


    List selectCarouselMap();
}
