package com.foottime.receptiodesk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foottime.receptiodesk.dto.OfficialDTO;
import com.foottime.receptiodesk.entity.Notice;
import com.foottime.receptiodesk.mapper.NoticeMapper;
import com.foottime.receptiodesk.service.INoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.entity.Notice;
import com.foottime.receptiodesk.dto.NoticeDTO;

import java.util.List;
import java.util.stream.Collectors;

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
    @Autowired(required = false)
    NoticeMapper noticeMapper;


    //分页查
    @Override
    public CommonPage<NoticeDTO> seleAll(Integer pageNum, Integer pageSize){
        Page<Notice> page = new Page<>(pageNum,pageSize);
        QueryWrapper<Notice> wrapper = new QueryWrapper<>();
        wrapper.lambda().like(Notice::getAddress,"");
        noticeMapper.selectPage(page,wrapper);
        List<Notice> list = page.getRecords();
        List<NoticeDTO> collect = list.stream().map((item) -> {
            NoticeDTO noticeDTO = new NoticeDTO();
            BeanUtils.copyProperties(item, noticeDTO);
            return noticeDTO;
        }).collect(Collectors.toList());
        CommonPage<NoticeDTO> commonPage = new CommonPage<>();
        commonPage.setPageNum(pageNum);
        commonPage.setPageSize(pageSize);
        commonPage.setTotalPage((int) page.getPages());
        commonPage.setTotal(page.getTotal());
        commonPage.setList(collect);
        return commonPage;
    }


}
