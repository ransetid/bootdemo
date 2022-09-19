package com.demo.app.service.impl;

import com.demo.app.entity.Student;
import com.demo.app.mapper.StudentMapper;
import com.demo.app.service.IStudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
