package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.Process;
import com.foottime.receptiodesk.mapper.ProcessMapper;
import com.foottime.receptiodesk.service.IProcessService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 加工工艺分类 服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class ProcessService extends ServiceImpl<ProcessMapper, Process> implements IProcessService {

}
