package com.foottime.receptiodesk.entity;

import java.time.LocalDate;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 订单信息
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Order对象", description="订单信息")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单编号")
    private Integer oid;

    @ApiModelProperty(value = "订单状态(1:未发货 2：已发货 3：已收货 4: 延迟收货)")
    private Integer ostatus;

    @ApiModelProperty(value = "订单价格")
    private Integer oprice;

    @ApiModelProperty(value = "下单时间")
    private LocalDate otime;

    @ApiModelProperty(value = "收货地址")
    private String address;

    @ApiModelProperty(value = "待扩充字段")
    private String remake1;


}
