package com.demo.app.controller;

import com.demo.app.entity.Dog;
import com.demo.app.service.IDogService;
import com.demo.app.utils.web.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xgblack
 * @since 2022-09-19
 */
@Controller
@RequestMapping("/app/dog")
@Api(value = "小狗数据", tags = "小狗数据接口")
public class DogController {

    @Resource
    private IDogService dogService;

    @GetMapping("/list")
    @ApiOperation(value = "查询所有小狗", notes = "查询所有小狗数据")
    @ResponseBody
    public R<List<Dog>> list(){
        return R.data(dogService.list());
    }

    @GetMapping("/list2")
    @ApiOperation(value = "查询所有小狗2", notes = "查询所有小狗数据2")
    @ResponseBody
    public R<List<Dog>> list2(){
        return R.data(dogService.getDogList());
    }

    @PostMapping("/save")
    @ApiOperation(value = "新增小狗信息", notes = "新增小狗数据")
    @ResponseBody
    public R save(Dog dog){
        if (dogService.save(dog)){
            return R.success("保存成功");
        }
        return R.fail("保存失败");
    }


}
