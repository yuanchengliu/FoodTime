package com.foottime.receptiodesk.service;

import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.NoticeDTO;
import com.foottime.receptiodesk.entity.Notice;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
public interface INoticeService extends IService<Notice> {
    CommonPage<NoticeDTO> seleAll(Integer pageNum, Integer pageSize, String searchResults);

}
