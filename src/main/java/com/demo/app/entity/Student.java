package com.demo.app.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 * 学生实体类
 * @author xgblack
 * @since 2022-09-19
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
@ApiModel(value = "Student对象", description = "学生表")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    //自动填充id，使用自增。需要在数据库中设置表字段自增
    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("生日")
    private LocalDateTime birth;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("爱好")
    private String hobby;

    @ApiModelProperty("描述")
    private String description;


}
