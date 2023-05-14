package com.foottime.receptiodesk.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

/**
 * 修改用户信息
 */
@Data
public class UserDTO {

    @ApiModelProperty(value = "用户头像")
    private String upicture;

    @ApiModelProperty(value = "用户名称")
    private String unickname;

    @ApiModelProperty(value = "用户生日")
    private LocalDate ubirthday;

    @ApiModelProperty(value = "用户性别(1:男 2：女 3：保密)")
    private Integer usex;

}