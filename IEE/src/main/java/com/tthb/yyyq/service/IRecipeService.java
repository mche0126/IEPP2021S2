package com.tthb.yyyq.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tthb.yyyq.entity.Recipe;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tthb.yyyq.vo.QueryFoodMessageVO;

import java.util.Set;

public interface IRecipeService extends IService<Recipe> {

    IPage<Recipe> queryRecipe(QueryFoodMessageVO queryFoodMessageVO);

    Set<String> queryAllCategory();
}
