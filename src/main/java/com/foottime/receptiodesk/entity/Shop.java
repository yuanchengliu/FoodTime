package com.foottime.receptiodesk.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**

 *
 * @author receptiodesk
 * @since 2023-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Shop对象", description = "")
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "店铺id")
    private Integer storeid;

    //TODO 修改
    @ApiModelProperty(value = "店铺名称")
    private String stname;


    @ApiModelProperty(value = "商品文字信息")
    private String stext;



    // TODO 更新
    @ApiModelProperty(value = "店铺图片地址")
    private String scture;



    @ApiModelProperty(value = "单价")
    private Integer unit;


}
