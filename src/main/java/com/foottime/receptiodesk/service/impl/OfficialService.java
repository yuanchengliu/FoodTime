package com.foottime.receptiodesk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.GoodsinfoDTO;
import com.foottime.receptiodesk.dto.OfficialDTO;
import com.foottime.receptiodesk.entity.Goods;
import com.foottime.receptiodesk.entity.Official;
import com.foottime.receptiodesk.entity.User;
import com.foottime.receptiodesk.mapper.AddressMapper;
import com.foottime.receptiodesk.mapper.OfficialMapper;
import com.foottime.receptiodesk.service.IOfficialService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.foottime.receptiodesk.entity.Address;
import com.foottime.receptiodesk.dto.AddressDTO;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
@Service
public class OfficialService extends ServiceImpl<OfficialMapper, Official> implements IOfficialService {
    @Autowired(required = false)
    Official official;
    @Autowired(required = false)
    OfficialMapper officialMapper;
    @Autowired(required = false)
    AddressMapper addressMapper;
    @Autowired(required = false)
    Address address;

    /**
     *  分页

     */
    @Override
    public CommonPage<OfficialDTO> getOfficial(Integer pageNum, Integer pageSize){
        Page<Official> page = new Page<>(pageNum,pageSize);
        QueryWrapper<Official> wrapper = new QueryWrapper<>();
        wrapper.lambda().like(Official::getAddress, "");
        officialMapper.selectPage(page, wrapper);
        List<Official> list = page.getRecords();
        List<OfficialDTO> collect = list.stream().map((item) -> {
            OfficialDTO officialDTO = new OfficialDTO();
            BeanUtils.copyProperties(item, officialDTO);
            return officialDTO;
        }).collect(Collectors.toList());
        CommonPage<OfficialDTO> commonPage = new CommonPage<>();
        commonPage.setPageNum(pageNum);
        commonPage.setPageSize(pageSize);
        commonPage.setTotalPage((int) page.getPages());
        commonPage.setTotal(page.getTotal());
        commonPage.setList(collect);
        return commonPage;


    }


    @Override
    public CommonPage<AddressDTO> seleAllAddress(Integer pageNum, Integer pageSize){
        Page<Address> page = new Page<>(pageNum,pageSize);
        QueryWrapper<Address> wrapper = new QueryWrapper<>();
        wrapper.lambda().like(Address::getAid,"");
        addressMapper.selectPage(page,wrapper);
        List<Address> list = page.getRecords();
        List<AddressDTO> collect = list.stream().map((item) ->{
            AddressDTO addressDTO = new AddressDTO();
            BeanUtils.copyProperties(item,addressDTO);
            return addressDTO;
        }).collect(Collectors.toList());
        CommonPage<AddressDTO> commonPage = new CommonPage<>();
        commonPage.setPageNum(pageNum);
        commonPage.setPageSize(pageSize);
        commonPage.setTotalPage((int) page.getPages());
        commonPage.setTotal(page.getTotal());
        commonPage.setList(collect);
        return commonPage;

    }




    }


