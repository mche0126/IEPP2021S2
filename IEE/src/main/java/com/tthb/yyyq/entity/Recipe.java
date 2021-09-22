package com.tthb.yyyq.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Recipe extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String ingredients;

    private String directions;

    private String link;

    private String cookTime;

    private String prepTime;

    private String totalTime;

    private String recipeCategory;

    private String images;

    private Double calories;

    private Double totalFat;

    private Double sodium;

    private Double potassium;

    private Double totalCarbohydrates;

    private Double dietaryFiber;

    private Double sugars;

    private Double protein;

    private Double vitaminA;

    private Double vitaminC;

    private Double calcium;

    private Double iron;

    private Double saturatedFat;

    private Double cholesterol;

    private Double emissionsLandUse;

    private Double emissionsFarm;

    private Double emissionsAnimalFeed;

    private Double emissionsProcessing;

    private Double emissionsTransport;

    private Double emissionsRetail;

    private Double emissionsPackaging;

    private Double emissionsTotal;

    private Double waterUsed;

    private Double landUsed;


}
