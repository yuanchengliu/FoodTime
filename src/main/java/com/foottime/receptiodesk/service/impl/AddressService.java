package com.foottime.receptiodesk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foottime.receptiodesk.dto.AddressDTO;
import com.foottime.receptiodesk.entity.Address;
import com.foottime.receptiodesk.mapper.AddressMapper;
import com.foottime.receptiodesk.service.IAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired(required = false)
    AddressMapper addressMapper;

    @Override
    public AddressDTO updateOstatus(Integer orderid,String ostatus){
        Address addressToUpdate = new Address();
        AddressDTO addressDTO = new AddressDTO();
        addressToUpdate.setOrderid(orderid);
        addressToUpdate.setOstatus(ostatus);
        addressMapper.update(addressToUpdate, new QueryWrapper<Address>().eq("orderid", orderid));
        BeanUtils.copyProperties(addressDTO,addressToUpdate);
        return addressDTO;
    }
    @Override
    public void deleOrder(Integer orderid){
        QueryWrapper<Address> wrapper = new QueryWrapper<>();
        addressMapper.delete(wrapper.eq("orderid",orderid));

    }


}
