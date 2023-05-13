package com.foottime.receptiodesk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foottime.common.CommonPage;
import com.foottime.receptiodesk.dto.RecipthInformationDTO;
import com.foottime.receptiodesk.entity.ReceiptInformation;
import com.foottime.receptiodesk.mapper.ReceiptInformationMapper;
import com.foottime.receptiodesk.service.IReceiptInformationService;
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
 * @since 2023-05-12
 */
@Service
public class ReceiptInformationService extends ServiceImpl<ReceiptInformationMapper, ReceiptInformation> implements IReceiptInformationService {
    @Resource
    ReceiptInformationMapper mapper;
    /**
     * 模糊查询分页
     * @param val 查询参数
     * @param pageSize 每页条数
     * @param pageNum 当前多少页
     * @return 分页
     */
    @Override
    public CommonPage<RecipthInformationDTO> selectLikeAll(String val, Integer pageSize, Integer pageNum) {
        Page<ReceiptInformation> page = new Page<>(pageNum, pageSize);
        //         val传入有值 QueryWrapper模糊查询并 如果val没有传入值则就只执行分页查询
        QueryWrapper<ReceiptInformation> wrapper = new QueryWrapper<>();
        if (val!=null){
            wrapper.lambda().like(ReceiptInformation::getRname, val)
                    .or().like(ReceiptInformation::getRphone, val)
                    .or().like(ReceiptInformation::getRaddress, val);
        }
        else {
            wrapper.select("rname,rphone,paddress");
        }
        //        将查询出来的数据与传入的分页的条件page 进行分页
        mapper.selectPage(page, wrapper);
        //        将分页出来的数据封装进list
        List<ReceiptInformation> list = page.getRecords();
        //        通过String流的方式将查询出来的数据封装进DTO
        List<RecipthInformationDTO> collect = list.stream().map((itme) -> {
            RecipthInformationDTO informationDTO = new RecipthInformationDTO();
            BeanUtils.copyProperties(itme, informationDTO);
            return informationDTO;
        }).collect(Collectors.toList());
        //        将page数据和DOT数据返回给封装的分页方法
        CommonPage<RecipthInformationDTO> commonPage = new CommonPage<>();
        commonPage.setPageNum(pageNum);
        commonPage.setPageSize(pageSize);
        commonPage.setTotalPage((int) page.getPages());
        commonPage.setTotal(page.getTotal());
        commonPage.setList(collect);
        return commonPage;
    }
    /**
     * 增加收货地址信息
     * @param informationDTO 收货人信息
     * @return 添加信息
     */
    @Override
    public RecipthInformationDTO addrecipth(RecipthInformationDTO informationDTO) {
        ReceiptInformation information = new ReceiptInformation();
        BeanUtils.copyProperties(informationDTO,information);
        QueryWrapper<ReceiptInformation> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(ReceiptInformation::getRname,informationDTO.getRname());
        List<ReceiptInformation> list = list(wrapper);
        if (list.size()>0){
            return null;
        }
        mapper.insert(information);
        return informationDTO;
    }
}
