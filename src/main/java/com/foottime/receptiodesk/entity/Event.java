package com.foottime.receptiodesk.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 官方活动
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Event对象", description="官方活动")
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "活动编号")
    private Integer eid;

    @ApiModelProperty(value = "活动标题")
    private String ename;

    @ApiModelProperty(value = "活动详情")
    private String eparticulars;

    @ApiModelProperty(value = "活动图片")
    private String epicture;

    @ApiModelProperty(value = "待扩充字段")
    private String remake1;


}
