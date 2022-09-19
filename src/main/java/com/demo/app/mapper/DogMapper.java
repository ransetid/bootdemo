package com.demo.app.mapper;

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

    List<Dog> selectDogList();
}
