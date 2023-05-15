package com.foottime.receptiodesk.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="NoticeDTO", description="物流状态")
public class LogisticsDTO {
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
