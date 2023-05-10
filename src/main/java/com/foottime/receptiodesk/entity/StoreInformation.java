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
@ApiModel(value="StoreInformation对象", description="")
public class StoreInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "店铺id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "店铺名称")
    private String sname;

    @ApiModelProperty(value = "店铺的联系方式")
    private Integer phone;

    @ApiModelProperty(value = "店铺分类")
    private String classify;

    @ApiModelProperty(value = "店铺地址")
    private String address;

    @ApiModelProperty(value = "待扩充字段")
    private String remake1;


}
