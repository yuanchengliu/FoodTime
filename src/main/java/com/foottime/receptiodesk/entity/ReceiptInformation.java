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
 * @since 2023-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ReceiptInformation对象", description="")
public class ReceiptInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "收货人ID")
    @TableId(value = "rid", type = IdType.AUTO)
    private Integer rid;

    @ApiModelProperty(value = "收货人信息")
    private String rname;

    @ApiModelProperty(value = "收货人电话")
    private Integer rphone;

    @ApiModelProperty(value = "收获人地址")
    private String raddress;


}
