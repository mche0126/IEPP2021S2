package com.tthb.yyyq.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Date: 2021/9/16
 * Description: 分页
 */
@Data
public class BaseVO {

    @ApiModelProperty("页数")
    private int size;

    @ApiModelProperty("条数")
    private int current;
}
