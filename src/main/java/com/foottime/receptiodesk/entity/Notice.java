package com.foottime.receptiodesk.entity;

import java.math.BigDecimal;
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
 * @since 2023-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Notice对象", description="")
public class Notice implements Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "通知消息id")
    private Integer id;

    @ApiModelProperty(value = "图片地址")
    private String address;

    @ApiModelProperty(value = "文字信息")
    private String message;

    @ApiModelProperty(value = "发布时间")
    private BigDecimal time;


}
