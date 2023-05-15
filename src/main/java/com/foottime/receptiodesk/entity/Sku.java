package com.foottime.receptiodesk.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品表SKU
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Sku对象", description="商品表SKU")
public class Sku implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品id")
    private String id;

    @ApiModelProperty(value = "SKU名称")
    private String name;

//    @ApiModelProperty(value = "价格（分）")
//    private BigDecimal price;

//    @ApiModelProperty(value = "库存数量")
//    private Integer num;

    @ApiModelProperty(value = "商品图片")
    private String image;

//    @ApiModelProperty(value = "商品图片列表")
//    private String images;

    @ApiModelProperty(value = "SPUID")
    private String spuId;

    @ApiModelProperty(value = "类目ID")
    private Integer categoryId;

    @ApiModelProperty(value = "类目名称")
    private String categoryName;

    @ApiModelProperty(value = "品牌id")
    private Integer brandId;

    @ApiModelProperty(value = "规格")
    private String skuAttribute;

    @ApiModelProperty(value = "商品状态 1-正常，2-下架，3-删除")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "待扩充字段")
    private String remake1;


}
