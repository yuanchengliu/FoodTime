package com.foottime.receptiodesk.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ProductSkuDTO", description="商品详情页Sku")
public class ProductDetailsDTO {

    @ApiModelProperty(value = "商品id")
    private Integer gid;

    @ApiModelProperty(value = "商品名")
    private String gtitle;

    @ApiModelProperty(value = "商品详情")
    private String gdetails;

    @ApiModelProperty(value = "属性名称")
    private String name;


    @ApiModelProperty(value = "规格价格")
    private BigDecimal price;

    @ApiModelProperty(value = "店铺名称")
    private String stname;

    @ApiModelProperty(value = "店铺图片地址")
    private String scture;


    @ApiModelProperty(value = "库存数量")
    private Integer num;

    @ApiModelProperty(value = "规格图片")
    private String image;

    @ApiModelProperty(value = "规格id")
    private Integer qid;

    @ApiModelProperty(value = "选中数量")
    private double innum;
}
