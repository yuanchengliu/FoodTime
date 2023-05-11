package com.foottime.receptiodesk.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserLogin", description="用户登录参数")
public class UserLogin {

    @ApiModelProperty(value = "用户名字")
    private String uname;

    @ApiModelProperty(value = "用户密码")
    private Integer upwd;
}
