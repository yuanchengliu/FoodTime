package com.foottime.receptiodesk.service;

import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.RecipthInformationDTO;
import com.foottime.receptiodesk.entity.ReceiptInformation;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-12
 */
public interface IReceiptInformationService extends IService<ReceiptInformation> {
    /**
     * 模糊查询分页
     * @param val 查询参数
     * @param pageSize 每页条数
     * @param pageNum 当前多少页
     * @return 分页
     */
    CommonPage<RecipthInformationDTO> selectLikeAll(String val, Integer pageSize, Integer pageNum);
    /**
     * 增加收货地址信息
     * @param informationDTO 收货人信息
     * @return 添加信息
     */
    RecipthInformationDTO addrecipth(RecipthInformationDTO informationDTO);
}
