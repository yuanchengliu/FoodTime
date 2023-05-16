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
 * 分类属性表
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SkuAttribute对象", description="分类属性表")
public class SkuAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "属性名称")
    private String name;

    @ApiModelProperty(value = "属性选项")
    private String options;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "待扩充字段")
    private String remake1;


}
