package com.foottime.receptiodesk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2023-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SpcShoppingCart对象", description="")
public class SpcShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "购物车ID")
    @TableId(value = "sid", type = IdType.AUTO)
    private Long sid;

    @ApiModelProperty(value = "用户ID")
    private Integer uid;

    @ApiModelProperty(value = "商品名称")
    private String cid;

    @ApiModelProperty(value = "规格信息")
    private String information;

    @ApiModelProperty(value = "购买数量")
    private String number;

    @ApiModelProperty(value = "待扩充字段")
    private String remake;

    @ApiModelProperty(value = "待扩充字段")
    private String remake1;

    @ApiModelProperty(value = "待扩充字段")
    private String remake2;


}
