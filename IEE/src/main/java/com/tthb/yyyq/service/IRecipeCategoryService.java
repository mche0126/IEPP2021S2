package com.tthb.yyyq.service;

import com.tthb.yyyq.entity.RecipeCategory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Set;

public interface IRecipeCategoryService extends IService<RecipeCategory> {

    Set<String> queryAllCategory();
}
