package com.peaceforest.communitymanager.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 出入记录
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "in_out_log")
public class InOutLog {
    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.INPUT)
    private String userId;

    /**
     * 申请id
     */
    @TableId(value = "application_id", type = IdType.INPUT)
    private String applicationId;

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
     * 出门时间
     */
    @TableField(value = "out_time")
    private LocalDateTime outTime;

    /**
     * 进门时间
     */
    @TableField(value = "in_time")
    private LocalDateTime inTime;
}