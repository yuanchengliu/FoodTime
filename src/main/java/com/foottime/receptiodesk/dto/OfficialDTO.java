package com.foottime.receptiodesk.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="OfficialDTO", description="官方消息搜索")
public class OfficialDTO {

    @ApiModelProperty(value = "图片地址")
    private String address;

    @ApiModelProperty(value = "官方文字消息")
    private String characters;


}
