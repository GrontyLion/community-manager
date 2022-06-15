package com.peaceforest.communitymanager.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 用户详情表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_detail")
public class UserDetail {
    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.INPUT)
    private String userId;

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
     * 房间号
     */
    @TableField(value = "room_no")
    private Integer roomNo;

    /**
     * 入住时间
     */
    @TableField(value = "check_in_time")
    private LocalDateTime checkInTime;

    /**
     * 是否在家
     */
    @TableField(value = "at_home")
    private Boolean atHome;

    /**
     * 是否存在
     */
    @TableField(value = "deleted")
    @TableLogic
    private Boolean deleted;

    /**
     * 角色id
     */
    @TableField(value = "role_id")
    private Integer roleId;
}