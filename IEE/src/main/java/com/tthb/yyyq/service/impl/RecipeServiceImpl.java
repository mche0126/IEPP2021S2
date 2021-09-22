package com.tthb.yyyq.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tthb.yyyq.entity.Recipe;
import com.tthb.yyyq.mapper.RecipeMapper;
import com.tthb.yyyq.service.IRecipeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tthb.yyyq.vo.QueryFoodMessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-09-10
 */
@Service
public class RecipeServiceImpl extends ServiceImpl<RecipeMapper, Recipe> implements IRecipeService {


    @Autowired
    private RecipeMapper recipeMapper;

    @Override
    public IPage<Recipe> queryRecipe(QueryFoodMessageVO queryFoodMessageVO) {
        IPage<Recipe> recipeIPage = new Page<>();
        recipeIPage.setCurrent(queryFoodMessageVO.getCurrent()).setSize(queryFoodMessageVO.getSize());
        QueryWrapper<Recipe> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(!StrUtil.hasEmpty(queryFoodMessageVO.getName()), "name", queryFoodMessageVO.getName());
        queryWrapper.eq(!StrUtil.hasEmpty(queryFoodMessageVO.getRecipeCategory()), "recipe_category", queryFoodMessageVO.getRecipeCategory());
        queryWrapper.orderByAsc("id");
        return recipeMapper.selectPage(recipeIPage,queryWrapper);
    }

    @Override
    public Set<String> queryAllCategory() {
        return recipeMapper.selectList(new QueryWrapper<Recipe>().select("recipe_category")).stream().map(Recipe::getRecipeCategory).collect(Collectors.toSet());
    }

}
