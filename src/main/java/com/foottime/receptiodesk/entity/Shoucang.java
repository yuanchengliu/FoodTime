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
@ApiModel(value="Shoucang对象", description="")
public class Shoucang implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "收藏id")
    private Integer favorite;

    @ApiModelProperty(value = "用户id")
    private Integer uid;

    @ApiModelProperty(value = "商品图片")
    private String picture;

    @ApiModelProperty(value = "商品文字详细信息")
    private String text;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "是否收藏1:是 2:否")
    private String collection;

    @ApiModelProperty(value = "发货时间")
    private LocalDateTime time;

    @ApiModelProperty(value = "价格")
    private Integer price;


}
