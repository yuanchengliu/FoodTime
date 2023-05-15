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
 * @since 2023-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Adverimages对象", description="")
public class Adverimages implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "轮播图ID")
    @TableId(value = "imageid", type = IdType.AUTO)
    private Integer imageid;

    @ApiModelProperty(value = "图片轮播图图片地址")
    private String imageurl;

    @ApiModelProperty(value = "轮播图图片类别")
    private String category;

    @ApiModelProperty(value = "待扩充字段")
    private String remake;


}
