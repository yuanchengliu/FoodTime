package com.foottime.receptiodesk.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Logistics对象", description="")
public class Logistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "物流id")
    private Integer id;

    @ApiModelProperty(value = "店铺名称")
    private String store;

    @ApiModelProperty(value = "商品图片")
    private String pictures;

    @ApiModelProperty(value = "商品价格")
    private Integer commodity;

    @ApiModelProperty(value = "商品名称")
    private String shoop;

    @ApiModelProperty(value = "商品签收状态")
    private String status;

    @ApiModelProperty(value = "是否加入购物车1:是 2:否")
    private Integer cart;

    @ApiModelProperty(value = "是否延长收货时间")
    private LocalDateTime delivery;

    @ApiModelProperty(value = "延长的时间")
    private LocalDateTime time;

    @ApiModelProperty(value = "收货状态")
    private String logistics;

    @ApiModelProperty(value = "订单号")
    private String orderid;
}
