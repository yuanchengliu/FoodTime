package com.foottime.receptiodesk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2023-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Address", description="收货信息")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单号")
    @TableId(value = "orderid", type = IdType.AUTO)
    private Integer orderid;

    @ApiModelProperty(value = "运输单号")
    private Integer shppingnumber;

    @ApiModelProperty(value = "用户ID")
    private Integer uid;

    @ApiModelProperty(value = "商品图片")
    private String shopPicture;

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
