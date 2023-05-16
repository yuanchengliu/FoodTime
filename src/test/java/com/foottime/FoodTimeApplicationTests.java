package com.foottime;

import com.foottime.receptiodesk.service.IAddressService;
import com.foottime.receptiodesk.service.ICategoryService;
import com.foottime.receptiodesk.service.IOfficialService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.foottime.receptiodesk.mapper.OfficialMapper;
@SpringBootTest
class FoodTimeApplicationTests {
    @Autowired(required = false)
    OfficialMapper  officialMapper;
    @Autowired(required = false)
    IOfficialService iOfficialService;
    @Autowired(required = false)
    IAddressService iAddressService;

    @Test
    void contextLoads() {
        officialMapper.selectById(151);
    }
    @Test
    void select(){
        Integer pageNum=1;
        Integer pageSize=1;
        String add="";
        iOfficialService.getOfficial(pageNum,pageSize);
    }
    @Test
    void querenshouhuo(){
        iAddressService.updateOstatus(789456,"已签收");
    }
}
