package com.foottime.receptiodesk.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="NoticeDTO", description="收货信息")
public class AddressDTO {
    @ApiModelProperty(value = "订单号")
    private Integer orderid;

    @ApiModelProperty(value = "运输单号")
    private Integer shppingnumber;

    @ApiModelProperty(value = "用户ID")
    private Integer aid;

    @ApiModelProperty(value = "用户头像")
    private String user_picture;

    @ApiModelProperty(value = "商品头像")
    private String shop_picture;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "商品详情")
    private String details;

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
