package com.tthb.yyyq.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tthb.yyyq.entity.Recipe;
import com.tthb.yyyq.entity.TFood;
import com.tthb.yyyq.service.FoodService;
import com.tthb.yyyq.service.IRecipeCategoryService;
import com.tthb.yyyq.service.IRecipeService;
import com.tthb.yyyq.vo.QueryFoodMessageVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@Api(tags = "食物相关接口")
@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private IRecipeService iRecipeService;

    @Autowired
    private IRecipeCategoryService iRecipeCategoryService;


    @RequestMapping("/queryFoodMessage")
    public List<TFood> queryFoodMessage(@RequestBody QueryFoodMessageVO queryFoodMessageVO) {
        return foodService.queryFoodMessage(queryFoodMessageVO);
    }

    @RequestMapping("/queryRecipe")
    public IPage<Recipe> queryRecipe(@RequestBody QueryFoodMessageVO queryFoodMessageVO) {
        return iRecipeService.queryRecipe(queryFoodMessageVO);
    }

    @RequestMapping("/queryAllFood")
    public Set<String> queryAllFood() {
        return foodService.queryAllFood();
    }

    @RequestMapping("/queryAllCategory")
    public Set<String> queryAllCategory() {
        return iRecipeCategoryService.queryAllCategory();
    }
}
