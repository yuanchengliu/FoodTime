package com.foottime.receptiodesk.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ShowproductlistDTO", description="首页推荐信息")
public class ShowproductlistDTO {

    @ApiModelProperty(value = "商品编号")
    private Integer gid;

    @ApiModelProperty(value = "商品标题")
    private String gtitle;

    @ApiModelProperty(value = "商品图片")
    private String image;

    @ApiModelProperty(value = "商品价格")
    private BigDecimal grice;

    @ApiModelProperty(value = "商品销量")
    private int Sales;

    @ApiModelProperty(value = "店铺名称")
    private String stname;
}

