package com.foottime.receptiodesk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.Address_InformationDTO;
import com.foottime.receptiodesk.dto.ShouchangDTO;
import com.foottime.receptiodesk.entity.Address;
import com.foottime.receptiodesk.entity.Shoucang;
import com.foottime.receptiodesk.mapper.ShoucangMapper;
import com.foottime.receptiodesk.service.IShoucangService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-14
 */
@Service
public class ShoucangService extends ServiceImpl<ShoucangMapper, Shoucang> implements IShoucangService {
    @Resource
    ShoucangMapper mapper;

    @Override
    public CommonPage<ShouchangDTO> selectshoucang(String val, Integer pageSize, Integer pageNum) {
        Page<Shoucang> page = new Page<>(pageNum, pageSize);
        //         val传入有值 QueryWrapper模糊查询并 如果val没有传入值则就只执行分页查询
        QueryWrapper<Shoucang> wrapper = new QueryWrapper<>();
        if (val!=null){
            wrapper.lambda().like(Shoucang::getPicture, val)
                    .or().like(Shoucang::getText, val)
                    .or().like(Shoucang::getTime, val)
                    .or().like(Shoucang::getPrice, val)
                    .or().like(Shoucang::getName, val);
        }
        else {
            wrapper.select("picture,text,name,time,price");
        }
        //        将查询出来的数据与传入的分页的条件page 进行分页
        mapper.selectPage(page, wrapper);
        //        将分页出来的数据封装进list
        List<Shoucang> list = page.getRecords();
        //        通过String流的方式将查询出来的数据封装进DTO
        List<ShouchangDTO> collect = list.stream().map((itme) -> {
            ShouchangDTO informationDTO = new ShouchangDTO();
            BeanUtils.copyProperties(itme, informationDTO);
            return informationDTO;
        }).collect(Collectors.toList());
        //        将page数据和DOT数据返回给封装的分页方法
        CommonPage<ShouchangDTO> commonPage = new CommonPage<>();
        commonPage.setPageNum(pageNum);
        commonPage.setPageSize(pageSize);
        commonPage.setTotalPage((int) page.getPages());
        commonPage.setTotal(page.getTotal());
        commonPage.setList(collect);
        return commonPage;
    }
}
