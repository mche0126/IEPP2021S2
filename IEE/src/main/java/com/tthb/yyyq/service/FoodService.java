package com.tthb.yyyq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tthb.yyyq.entity.TFood;
import com.tthb.yyyq.vo.QueryFoodMessageVO;

import java.util.List;
import java.util.Set;

public interface FoodService extends IService<TFood> {

    List<TFood> queryFoodMessage(QueryFoodMessageVO queryFoodMessageVO);

    Set<String> queryAllFood();
}
