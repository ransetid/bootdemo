package com.demo.app.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
 *
 * @author xgblack
 * @since 2022-09-19
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("animal.dog")
@ToString
@ApiModel(value = "Dog对象", description = "")
public class Dog implements Serializable {

    private static final long serialVersionUID = 1L;

    //自动填充id，使用雪花算法
    @ApiModelProperty("主键")
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("生日")
    private LocalDateTime birth;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("毛发颜色")
    private String color;

    @ApiModelProperty("品种")
    private String variety;


}
