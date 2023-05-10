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
 * @since 2023-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Classifiction对象", description="")
public class Classifiction implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "品牌id")
    private Integer bid;

    @ApiModelProperty(value = "品牌名字")
    private String bname;

    @ApiModelProperty(value = "高级选项")
    private String option;

    @ApiModelProperty(value = "一级分类")
    private String fsort;

    @ApiModelProperty(value = "商品分类")
    private String sort;

    @ApiModelProperty(value = "二级分类")
    private String tsort;

    @ApiModelProperty(value = "商品id")
    private Integer cid;


}
