package com.demo.app.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.app.entity.Student;
import com.demo.app.service.IStudentService;
import com.demo.app.utils.web.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@RestController
@RequestMapping("/app/student")
@Api(value = "学生数据", tags = "学生数据接口")
public class StudentController {

    @Resource
    private IStudentService studentService;

    /**
     * 根据学生id查询学生信息
     * @param id
     * @return
     */
    @ApiOperation(value = "查询学生详情", notes = "查询学生数据详情")
    @GetMapping("/detail/{id}")
    public R<Student> detail(@PathVariable("id")@ApiParam(value = "学生ID", required = true) Long id) {
        return R.data(studentService.getById(id));
    }

    /**
     * 根据学生id查询学生信息2
     * @param id
     * @return
     */
    @ApiOperation(value = "查询学生详情2", notes = "查询学生数据详情2")
    @GetMapping("/detail")
    public R<Student> detail2(@ApiParam(value = "学生ID", required = true)@RequestParam Long id) {
        return R.data(studentService.getById(id));
    }

    /**
     * 分页查询学生列表
     * @param current
     * @param size
     * @param name
     * @return
     */
    @GetMapping("/pagelist")
    @ApiOperation(value = "分页查询学生列表", notes = "分页查询学生列表")
    public R<Page<Student>> pagelist(@ApiParam(value = "当前页", required = true)@RequestParam Integer current,
                                    @ApiParam(value = "每页条数", required = true)@RequestParam Integer size,
                                    @ApiParam(value = "姓名", required = false)@RequestParam(required = false) String name
    ) {
        LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>();
        if (name != null && !"".equals(name)) {
            queryWrapper.like(Student::getName, name);
        }
        queryWrapper.orderByAsc(Student::getId);

        return R.data(studentService.page(new Page<>(current, size), queryWrapper));
    }

    /**
     * 查询学生列表
     * @return
     */
    @GetMapping("/list")
    @ApiOperation(value = "查询所有学生", notes = "查询所有学生数据")
    public R<List<Student>> list(){
        return R.data(studentService.list());
    }

    @PostMapping("/save")
    @ApiOperation(value = "新增学生信息", notes = "新增学生数据")
    public R save(Student student){
        if (studentService.save(student)){
            return R.success("保存成功");
        }
        return R.fail("保存失败");
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改学生信息", notes = "修改学生数据")
    public R update(Student student){
        if (studentService.updateById(student)){
            return R.success("修改成功");
        }
        return R.fail("修改失败");
    }

    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除学生信息", notes = "删除学生数据")
    public R delete(@PathVariable("id") Long id){
        if (studentService.removeById(id)){
            return R.success("删除成功");
        }
        return R.fail("删除失败");
    }


}
