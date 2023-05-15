package com.foottime.receptiodesk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.Address_InformationDTO;
import com.foottime.receptiodesk.dto.Forum_InformationDTO;
import com.foottime.receptiodesk.dto.ProductDetailsDTO;
import com.foottime.receptiodesk.entity.Address;
import com.foottime.receptiodesk.entity.Forum;
import com.foottime.receptiodesk.mapper.AddressMapper;
import com.foottime.receptiodesk.service.IAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 收货信息 服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
@Service
public class AddressService extends ServiceImpl<AddressMapper, Address> implements IAddressService {
@Resource
AddressMapper mapper;
//    @Override
//    public CommonPage<Address_InformationDTO> selectaddress(String val, Integer pageSize, Integer pageNum) {
//        Page<Address> page = new Page<>(pageNum, pageSize);
//        //         val传入有值 QueryWrapper模糊查询并 如果val没有传入值则就只执行分页查询
//        QueryWrapper<Address> wrapper = new QueryWrapper<>();
//        if (val!=null){
//            wrapper.lambda().like(Address::getShopPicture, val)
//                    .or().like(Address::getOstatus, val)
//                    .or().like(Address::getNumber, val)
//                    .or().like(Address::getAmount, val)
//                    .or().like(Address::getName, val);
//        }
//        else {
//            wrapper.select("shopPicture,name,ostatus,number,amount");
//        }
//        //        将查询出来的数据与传入的分页的条件page 进行分页
//        mapper.selectPage(page, wrapper);
//        //        将分页出来的数据封装进list
//        List<Address> list = page.getRecords();
//        //        通过String流的方式将查询出来的数据封装进DTO
//        List<Address_InformationDTO> collect = list.stream().map((itme) -> {
//            Address_InformationDTO informationDTO = new Address_InformationDTO();
//            BeanUtils.copyProperties(itme, informationDTO);
//            return informationDTO;
//        }).collect(Collectors.toList());
//        //        将page数据和DOT数据返回给封装的分页方法
//        CommonPage<Address_InformationDTO> commonPage = new CommonPage<>();
//        commonPage.setPageNum(pageNum);
//        commonPage.setPageSize(pageSize);
//        commonPage.setTotalPage((int) page.getPages());
//        commonPage.setTotal(page.getTotal());
//        commonPage.setList(collect);
//        return commonPage;
//    }
    /**
     * 个人信息查询订单
     */
    @Override
    public List<Address_InformationDTO> productDetails(Integer id) {
        return mapper.address(id);
    }
}
