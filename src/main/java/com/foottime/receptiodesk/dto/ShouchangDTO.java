package com.foottime.receptiodesk.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ShoucangDTO", description="个人中心--收藏查询")
public class ShouchangDTO {

    @ApiModelProperty(value = "用户ID")
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    @ApiModelProperty(value = "收藏id")
    private Integer favorite;

    @ApiModelProperty(value = "商品图片")
    private String picture;

    @ApiModelProperty(value = "商品文字详细信息")
    private String text;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "发货时间")
    private LocalDateTime time;

    @ApiModelProperty(value = "价格")
    private Integer price;
}
