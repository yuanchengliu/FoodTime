package com.foottime.receptiodesk.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "UserRegistrationDTO", description = "用户注册信息")
public class UserRegistrationDTO {
    @ApiModelProperty(value = "用户名字")
    private String uname;

    @ApiModelProperty(value = "用户密码")
    private Integer upwd;

    @ApiModelProperty(value = "用户昵称")
    private String unickname;

    @ApiModelProperty(value = "用户性别(1:男 2：女 3：保密)")
    private Integer usex;

    @ApiModelProperty(value = "用户生日")
    private LocalDate ubirthday;
}

