package com.foottime.receptiodesk.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 加工工艺分类
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Process对象", description="加工工艺分类")
public class Process implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "加工工艺编号")
    private Integer pid;

    @ApiModelProperty(value = "加工工艺名称")
    private String pname;


}
