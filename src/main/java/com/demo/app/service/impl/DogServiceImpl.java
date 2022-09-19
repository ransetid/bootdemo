package com.demo.app.service.impl;

import com.demo.app.entity.Dog;
import com.demo.app.mapper.DogMapper;
import com.demo.app.service.IDogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xgblack
 * @since 2022-09-19
 */
@Service
public class DogServiceImpl extends ServiceImpl<DogMapper, Dog> implements IDogService {

}
