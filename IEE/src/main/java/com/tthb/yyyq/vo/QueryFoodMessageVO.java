package com.tthb.yyyq.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("食物查询入参")
public class QueryFoodMessageVO extends BaseVO{

    @ApiModelProperty("类别")
    private String category;

    @ApiModelProperty("关键词")
    private String keyWords;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("食谱类别")
    private String recipeCategory;
}
