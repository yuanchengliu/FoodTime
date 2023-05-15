package com.foottime.receptiodesk.mapper;

import com.foottime.receptiodesk.dto.Address_InformationDTO;
import com.foottime.receptiodesk.dto.ShouchangDTO;
import com.foottime.receptiodesk.entity.Shoucang;
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
public interface ShoucangMapper extends BaseMapper<Shoucang> {
    List<ShouchangDTO> shoucangselect(Integer id);
}
