package com.foottime.receptiodesk.service;

import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.Address_InformationDTO;
import com.foottime.receptiodesk.dto.Forum_InformationDTO;
import com.foottime.receptiodesk.dto.ProductDetailsDTO;
import com.foottime.receptiodesk.entity.Address;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 收货信息 服务类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
public interface IAddressService extends IService<Address> {
//    /**
//     * 模糊查询分页
//     * @param val 查询参数
//     * @param pageSize 每页条数
//     * @param pageNum 当前多少页
//     * @return 分页
//     * */
//    CommonPage<Address_InformationDTO> selectaddress(String val, Integer pageSize, Integer pageNum);
//
    /**
     * 个人信息查询订单
     */

    List<Address_InformationDTO> productDetails(Integer id);
}
