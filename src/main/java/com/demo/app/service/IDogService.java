package com.demo.app.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.app.entity.Dog;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xgblack
 * @since 2022-09-19
 */
public interface IDogService extends IService<Dog> {

    List<Dog> getDogList();

}
