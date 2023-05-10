package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.Forum;
import com.foottime.receptiodesk.mapper.ForumMapper;
import com.foottime.receptiodesk.service.IForumService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class ForumService extends ServiceImpl<ForumMapper, Forum> implements IForumService {

}
