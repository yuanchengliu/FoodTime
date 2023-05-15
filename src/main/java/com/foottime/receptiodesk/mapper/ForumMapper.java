package com.foottime.receptiodesk.mapper;


import com.foottime.receptiodesk.dto.Address_InformationDTO;
import com.foottime.receptiodesk.dto.Forum_InformationDTO;
import com.foottime.receptiodesk.entity.Forum;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-14
 */
@Mapper
public interface ForumMapper extends BaseMapper<Forum> {
    /**
     * 个人信息查询发表
     */
    List<Forum_InformationDTO> forumselect(Integer id);

}
