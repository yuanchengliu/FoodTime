package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.Taste;
import com.foottime.receptiodesk.mapper.TasteMapper;
import com.foottime.receptiodesk.service.ITasteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 口味分类 服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class TasteService extends ServiceImpl<TasteMapper, Taste> implements ITasteService {

}
