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
 * @since 2023-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Hotimages对象", description="")
public class Hotimages implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "热点图片id")
    private Integer imageid;

    @ApiModelProperty(value = "图片地址")
    private String imageurl;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime creattime;

    @ApiModelProperty(value = "商品id")
    private Integer catid;

    @ApiModelProperty(value = "图片类型")
    private Integer type;

    @ApiModelProperty(value = "待扩充字段")
    private String remake1;


}
