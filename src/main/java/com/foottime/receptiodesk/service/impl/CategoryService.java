package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.Category;
import com.foottime.receptiodesk.mapper.CategoryMapper;
import com.foottime.receptiodesk.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品类目 服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class CategoryService extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
