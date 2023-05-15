package com.foottime.receptiodesk.service;

import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.Address_InformationDTO;
import com.foottime.receptiodesk.dto.ShouchangDTO;
import com.foottime.receptiodesk.entity.Shoucang;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-14
 */
public interface IShoucangService extends IService<Shoucang> {

    CommonPage<ShouchangDTO> selectshoucang(String val, Integer pageSize, Integer pageNum);

}
