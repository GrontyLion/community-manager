package com.peaceforest.communitymanager.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 申请表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_application")
public class UserApplication {
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
     * 用户id
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 出入开始时间
     */
    @TableField(value = "application_start_time")
    private LocalDateTime applicationStartTime;

    /**
     * 出入结束时间
     */
    @TableField(value = "application_end_time")
    private LocalDateTime applicationEndTime;

    /**
     * 请求内容
     */
    @TableField(value = "application_content")
    private String applicationContent;

    /**
     * 请求附件
     */
    @TableField(value = "application_attachment")
    private String applicationAttachment;

    /**
     * 申请状态;0，审核中；1，审核通过；2，取消申请
     */
    @TableField(value = "application_status")
    private Integer applicationStatus;
}