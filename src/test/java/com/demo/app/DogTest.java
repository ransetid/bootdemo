package com.demo.app;

import com.demo.app.service.IDogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author xg BLACK
 * @date 2022/9/19 14:28
 * description: Dog单元测试类
 */
@SpringBootTest(classes = BootDemoApplication.class)
@RunWith(SpringRunner.class)
public class DogTest {

    @Resource
    private IDogService dogService;

    @Test
    public void testDog(){
        dogService.list().forEach(System.out::println);
    }
}
