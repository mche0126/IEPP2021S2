package com.tthb.yyyq.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tthb.yyyq.entity.TFood;
import com.tthb.yyyq.mapper.FoodMapper;
import com.tthb.yyyq.service.FoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tthb.yyyq.vo.QueryFoodMessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-08-28
 */
@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, TFood> implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<TFood> queryFoodMessage(QueryFoodMessageVO queryFoodMessageVO) {
        QueryWrapper<TFood> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(!StrUtil.hasEmpty(queryFoodMessageVO.getCategory()), "category", queryFoodMessageVO.getCategory());
        queryWrapper.eq(!StrUtil.hasEmpty(queryFoodMessageVO.getKeyWords()), "key_words", queryFoodMessageVO.getKeyWords());
        return foodMapper.selectList(queryWrapper);
    }

    @Override
    public Set<String> queryAllFood() {
        return foodMapper.selectList(new QueryWrapper<TFood>().select("food")).stream().map(TFood::getFood).collect(Collectors.toSet());
    }
}
