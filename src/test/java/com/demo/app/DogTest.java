package com.demo.app;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.demo.app.entity.Dog;
import com.demo.app.mapper.DogMapper;
import com.demo.app.service.IDogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xg BLACK
 * @date 2022/9/19 14:28
 * description: Dog单元测试类
 */
@SpringBootTest(classes = BootDemoApplication.class)
@RunWith(SpringRunner.class)
public class DogTest {
//
//    @Resource
//    private IDogService dogService;
//
//    @Test
//    public void testDog(){
//        dogService.list().forEach(System.out::println);
//    }


    @Resource
    private DogMapper dogMapper;
    @Resource
    private IDogService dogService;
    @Test
    public void testDog(){
        LambdaQueryWrapper<Dog> wrapper = new LambdaQueryWrapper<>();
        //select * from animal.dog name="小白"
        wrapper.eq(Dog::getName,"小白");
        List<Dog> list= dogService.list(wrapper);
//        List<Dog> list1 = dogService.list(wrapper);//ctrl + alt +v 自动写类型
        System.out.println(list);
        List<Dog> dogs = dogMapper.selectDogList();
        System.out.println(dogs);
    }
}
