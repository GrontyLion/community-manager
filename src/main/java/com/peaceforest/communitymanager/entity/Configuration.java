package com.peaceforest.communitymanager.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 系统配置表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "configuration")
public class Configuration {
    /**
     * 配置id
     */
    @TableId(value = "config_id", type = IdType.INPUT)
    private String configId;

    /**
     * 乐观锁
     */
    @TableField(value = "REVISION")
    @Version
    private Integer revision;

    /**
     * 创建人
     */
    @TableField(value = "CREATED_BY", fill = FieldFill.INSERT)
    private String createdBy;

    /**
     * 创建时间
     */
    @TableField(value = "CREATED_TIME", fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    /**
     * 更新人
     */
    @TableField(value = "UPDATED_BY", fill = FieldFill.INSERT_UPDATE)
    private String updatedBy;

    /**
     * 更新时间
     */
    @TableField(value = "UPDATED_TIME", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime;

    /**
     * 自动同意申请
     */
    @TableField(value = "auto_agree")
    private Boolean autoAgree;

    /**
     * 允许用户自己注册
     */
    @TableField(value = "allow_register")
    private Boolean allowRegister;

    /**
     * 采用该配置
     */
    @TableField(value = "using_this")
    private Boolean usingThis;
}