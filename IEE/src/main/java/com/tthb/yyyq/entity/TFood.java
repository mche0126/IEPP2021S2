package com.tthb.yyyq.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TFood extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String food;

    private String calories;

    private String totalFat;

    private String sodium;

    private String potassium;

    private String totalCarbohydrates ;

    private String dietaryFiber;

    private String sugars;

    private String protein;

    private String vitaminA;

    private String vitaminC;

    private String calcium;

    private String iron;

    private String saturatedFat;

    private String cholesterol;

    private String emissionsFrom;

    private String category;

    private String keyWords;

    private String emissionsLandUse;

    private String emissionsFarm;

    private String emissionsAnimalFeed;

    private String emissionsProcessing;

    private String emissionsTransport;

    private String emissionsRetail;

    private String emissionsPackaging;

    private String emissionsTotal;

    private String waterUsed;

    private String landUsed;


}
