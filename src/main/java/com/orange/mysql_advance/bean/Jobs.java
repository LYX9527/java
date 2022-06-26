package com.orange.mysql_advance.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName jobs
 */
@TableName(value ="jobs")
@Data
public class Jobs implements Serializable {
    /**
     * 
     */
    @TableId
    private String jobId;

    /**
     * 
     */
    private String jobTitle;

    /**
     * 
     */
    private Integer minSalary;

    /**
     * 
     */
    private Integer maxSalary;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}