package com.foottime.receptiodesk.entity;

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
@ApiModel(value="Official对象", description="")
public class Official implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "官方id")
    private Integer id;

    @ApiModelProperty(value = "图片地址")
    private String address;

    @ApiModelProperty(value = "官方文字消息")
    private String characters;


}
