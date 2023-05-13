package com.foottime.receptiodesk.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 收货信息
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Address对象", description="收货信息")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单号")
    private Integer orderid;

    @ApiModelProperty(value = "运输单号")
    private Integer shppingnumber;

    @ApiModelProperty(value = "用户ID")
    private Integer aid;

    @ApiModelProperty(value = "订单状态")
    private String ostatus;

    @ApiModelProperty(value = "支付状态")
    private String pstatus;

    @ApiModelProperty(value = "订单日期")
    @TableField("createTime")
    private LocalDateTime createtime;

    @ApiModelProperty(value = "支付方式")
    private String method;

    @ApiModelProperty(value = "支付时间")
    private LocalDateTime givetime;

    @ApiModelProperty(value = "用户地址")
    private String address;

    @ApiModelProperty(value = "运费")
    private Integer items;

    @ApiModelProperty(value = "商品总个数")
    private Integer number;

    @ApiModelProperty(value = "订单总金额")
    private Integer amount;


}
