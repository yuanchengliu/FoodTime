package com.foottime.receptiodesk.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="RecipthInformationDto", description="收货人信息查询添加")
public class RecipthInformationDTO {
    @ApiModelProperty(value = "收货人姓名")
    private String rname;

    @ApiModelProperty(value = "收货人电话")
    private Integer rphone;

    @ApiModelProperty(value = "收获人地址")
    private String raddress;
}
