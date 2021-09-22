package com.tthb.yyyq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tthb.yyyq.entity.Recipe;
import com.tthb.yyyq.entity.RecipeCategory;
import com.tthb.yyyq.mapper.RecipeCategoryMapper;
import com.tthb.yyyq.service.IRecipeCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
 * @since 2021-09-16
 */
@Service
public class RecipeCategoryServiceImpl extends ServiceImpl<RecipeCategoryMapper, RecipeCategory> implements IRecipeCategoryService {

    @Autowired
    private RecipeCategoryMapper recipeCategoryMapper;

    @Override
    public Set<String> queryAllCategory() {
        return recipeCategoryMapper.selectList(new QueryWrapper<RecipeCategory>().select("category_name")).stream().map(RecipeCategory::getCategoryName).collect(Collectors.toSet());
    }

}
