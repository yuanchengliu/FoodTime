package com.foottime.receptiodesk.service.impl;

import com.foottime.receptiodesk.entity.Address;
import com.foottime.receptiodesk.mapper.AddressMapper;
import com.foottime.receptiodesk.service.IAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 收货信息 服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Service
public class AddressService extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
