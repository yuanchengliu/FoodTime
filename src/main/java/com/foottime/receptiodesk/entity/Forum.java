package com.foottime.receptiodesk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author receptiodesk
 * @since 2023-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Forum对象", description="")
public class Forum implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "论坛id")
    @TableId(value = "fid", type = IdType.AUTO)
    private Integer fid;

    @ApiModelProperty(value = "用户头像")
    private String remake;

    @ApiModelProperty(value = "用户昵称")
    private String fname;

    @ApiModelProperty(value = "用户地址")
    private String address;

    @ApiModelProperty(value = "发布的文字信息")
    private String message;

    @ApiModelProperty(value = "发布的图片信息")
    private String picture;

    @ApiModelProperty(value = "发表时间")
    private String publication;

    @ApiModelProperty(value = "收藏数")
    private String collections;

    @ApiModelProperty(value = "点赞数")
    private String likes;

    @ApiModelProperty(value = "待扩充字段")
    private String remake1;

    @ApiModelProperty(value = "待扩充字段")
    private String remake2;


}
