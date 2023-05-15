package com.foottime.receptiodesk.service;

import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.Address_InformationDTO;
import com.foottime.receptiodesk.dto.ShouchangDTO;
import com.foottime.receptiodesk.entity.Shoucang;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-14
 */
public interface IShoucangService extends IService<Shoucang> {

//    CommonPage<ShouchangDTO> selectshoucang(String val, Integer pageSize, Integer pageNum);
    /**
     * 个人信息查询收藏
     */
    List<ShouchangDTO> shoucangselect(Integer id);
}
