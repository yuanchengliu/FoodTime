package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.Notice;
import com.foottime.receptiodesk.mapper.NoticeMapper;
import com.foottime.receptiodesk.service.INoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
@Service
public class NoticeService extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

}
