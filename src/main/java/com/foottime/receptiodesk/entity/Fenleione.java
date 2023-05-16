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
 * @since 2023-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Fenleione对象", description="")
public class Fenleione implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "品牌")
    private String brand;

    @ApiModelProperty(value = "省份")
    private String provinces;

    @ApiModelProperty(value = "价格")
    private Integer price;

    @ApiModelProperty(value = "一级分类")
    private String one;

    @ApiModelProperty(value = "二级分类")
    private String two;

    @ApiModelProperty(value = "商品图片")
    private String pictures;

    @ApiModelProperty(value = "更多")
    private String more;


}
