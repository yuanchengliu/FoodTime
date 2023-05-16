package com.foottime.receptiodesk.service;

import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.AddressDTO;
import com.foottime.receptiodesk.dto.OfficialDTO;
import com.foottime.receptiodesk.entity.Official;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
public interface IOfficialService extends IService<Official> {
    CommonPage<OfficialDTO> getOfficial(Integer pageNum, Integer pageSize);
    CommonPage<AddressDTO> seleAllAddress(Integer pageNum, Integer pageSize);

}
