package com.foottime.receptiodesk.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * 论坛发表页
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Forum_publishedDTO", description="论坛发表")
public class Forum_publishedDTO {
    @ApiModelProperty(value = "发布的文字标题")
    private String text;

    @ApiModelProperty(value = "发布的文字信息")
    private String message;

    @ApiModelProperty(value = "发布的图片地址")
    private String picture;
}
