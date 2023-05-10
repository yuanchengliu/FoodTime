package com.foottime.receptiodesk.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 口味分类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Taste对象", description="口味分类")
public class Taste implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "口味分类编号")
    private Integer tid;

    @ApiModelProperty(value = "口味分类名")
    private String tname;


}
