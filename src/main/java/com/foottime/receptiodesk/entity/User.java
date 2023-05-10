package com.foottime.receptiodesk.entity;

import java.time.LocalDate;
import java.sql.Blob;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户信息
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="User对象", description="用户信息")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    private Integer uid;

    @ApiModelProperty(value = "用户名字")
    private String uname;

    @ApiModelProperty(value = "用户密码")
    private Integer upwd;

    @ApiModelProperty(value = "用户昵称")
    private String unickname;

    @ApiModelProperty(value = "用户头像")
    private Blob upicture;

    @ApiModelProperty(value = "用户性别(1:男 2：女 3：保密)")
    private Integer usex;

    @ApiModelProperty(value = "用户生日")
    private LocalDate ubirthday;

    @ApiModelProperty(value = "待扩充字段")
    private String remake1;


}
