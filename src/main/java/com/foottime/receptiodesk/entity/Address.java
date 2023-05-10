package com.foottime.receptiodesk.entity;

import java.sql.Blob;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 收货信息
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Address对象", description="收货信息")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "收件人ID")
    private Integer aid;

    @ApiModelProperty(value = "收货人姓名")
    private String aname;

    @ApiModelProperty(value = "收件人手机号")
    private Integer aphone;

    @ApiModelProperty(value = "收件人地址")
    private String address;

    @ApiModelProperty(value = "是否默认地址 1: 是 0: 否")
    @TableField("isDefault")
    private Blob isdefault;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private Integer createtime;

    @ApiModelProperty(value = "更新时间")
    @TableField("updateTime")
    private Integer updatetime;

    @ApiModelProperty(value = "创建人")
    @TableField("createUser")
    private Integer createuser;

    @ApiModelProperty(value = "待扩充字段	待扩充字段")
    private String remake1;

    @ApiModelProperty(value = "待扩充字段")
    private String remake2;

    @ApiModelProperty(value = "待扩充字段")
    private String remake3;


}
