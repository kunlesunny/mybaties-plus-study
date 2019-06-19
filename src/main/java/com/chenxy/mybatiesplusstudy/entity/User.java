package com.chenxy.mybatiesplusstudy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    /**
     * 主键
     */
    @TableId
    private long id;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 上级id
     */
    private long managerId;

    /**
     * 备注
     */
    @TableField(exist = false)
    private String remark;
}
