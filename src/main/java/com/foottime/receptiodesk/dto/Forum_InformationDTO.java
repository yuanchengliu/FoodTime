package com.foottime.receptiodesk.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 个人中心---发表查询
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Forum_InformationDTO", description="论坛信息")
public class Forum_InformationDTO {


    @ApiModelProperty(value = "发布的文字标题")
    private String text;

    @ApiModelProperty(value = "发表时间")
    private LocalDateTime publication;
}
