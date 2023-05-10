package com.foottime.receptiodesk.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 净含量分类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Quality对象", description="净含量分类")
public class Quality implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "重量编号")
    private Integer qid;

    @ApiModelProperty(value = "重量")
    private Integer quality;


}
