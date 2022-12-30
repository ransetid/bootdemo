package com.demo.app.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.demo.app.entity.Dog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xgblack
 * @since 2022-09-19
 */
public interface DogMapper extends BaseMapper<Dog> {

    @DS("slave_1")
    List<Dog> selectDogList();
}
