package com.foottime.receptiodesk.mapper;

import com.foottime.receptiodesk.dto.Address_InformationDTO;
import com.foottime.receptiodesk.dto.ProductDetailsDTO;
import com.foottime.receptiodesk.entity.Address;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 收货信息 Mapper 接口
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-14
 */
@Mapper
public interface AddressMapper extends BaseMapper<Address> {
    /**
     * 个人信息查询订单
     */
    List<Address_InformationDTO> address(Integer id);
}
