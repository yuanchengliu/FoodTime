package com.foottime.receptiodesk.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.sql.Blob;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品信息
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Goods对象", description = "商品信息")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品编号")
    private Integer gid;

    @ApiModelProperty(value = "分类ID(轮)")
    private String classify;

    @ApiModelProperty(value = "分类ID(轮)")
    private String id;

    @ApiModelProperty(value = "商品名")
    private String gtitle;

    @ApiModelProperty(value = "商品详情")
    private String gdetails;

    @ApiModelProperty(value = "商品数量")
    private String gmanufacturer;

    @ApiModelProperty(value = "上架日期")
    private LocalDate gtime;

    @ApiModelProperty(value = "商品价格")
    private BigDecimal grice;


    //TODO 增加
    @ApiModelProperty(value = "商品销量")
    private int sales;
    @ApiModelProperty(value = "店铺id")
    private Integer storeid;



    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "商品状态 1: 正常 2: 下架 3: 删除")
    private Integer status;

    @ApiModelProperty(value = "待扩充字段")
    private String remake2;

    @ApiModelProperty(value = "待扩充字段")
    private String remake3;


}
