package com.foottime.receptiodesk.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
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
 * @since 2023-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Transport对象", description="")
public class Transport implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "运输id")
    private Integer shippingid;

    @ApiModelProperty(value = "运输单号")
    private Integer tnumber;

    @ApiModelProperty(value = "订单号")
    private Integer orderid;

    @ApiModelProperty(value = "运输状态")
    private String status;

    @ApiModelProperty(value = "时间")
    private LocalDateTime time;

    @ApiModelProperty(value = "运输状态详细文字信息")
    private String information;

    @ApiModelProperty(value = "运输方名称")
    private String carrier;

    @ApiModelProperty(value = "商品图片地址")
    private String picture;


}
