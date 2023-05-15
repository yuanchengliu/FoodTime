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
 * @since 2023-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Selected对象", description="")
public class Selected implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "精选列表id")
    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    @ApiModelProperty(value = "精选列表标题")
    private String sname;

    @ApiModelProperty(value = "精选列表图片")
    private String simg;

    @ApiModelProperty(value = "精选列表分类")
    private String sfen;


}
