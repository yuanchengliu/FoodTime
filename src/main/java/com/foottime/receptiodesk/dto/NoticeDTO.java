package com.foottime.receptiodesk.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="NoticeDTO", description="通知消息")
public class NoticeDTO {
    @ApiModelProperty(value = "图片地址")
    private String address;

    @ApiModelProperty(value = "通知消息文本")
    private String message;

    @ApiModelProperty(value = "发布时间")
    private BigDecimal time;
}
