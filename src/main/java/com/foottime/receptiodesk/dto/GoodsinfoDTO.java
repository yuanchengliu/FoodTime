package com.foottime.receptiodesk.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="GoodsDTO", description="商品搜索信息")
public class GoodsinfoDTO {

    @ApiModelProperty(value = "商品标题")
    private String gtitle;

    @ApiModelProperty(value = "商品图片")
    private String gicture;

    @ApiModelProperty(value = "商品价格")
    private BigDecimal grice;
}
