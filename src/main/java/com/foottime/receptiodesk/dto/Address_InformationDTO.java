package com.foottime.receptiodesk.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * 个人中心---订单查询
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Address_InformationDTO", description="个人中心--订单查询")
public class Address_InformationDTO {

    @ApiModelProperty(value = "订单号")
    @TableId(value = "orderid", type = IdType.AUTO)
    private Integer orderid;

    @ApiModelProperty(value = "用户ID")
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    @ApiModelProperty(value = "商品图片")
    private String shopPicture;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "订单状态")
    private String ostatus;

    @ApiModelProperty(value = "商品总个数")
    private Integer number;

    @ApiModelProperty(value = "订单总金额")
    private Integer amount;
}
