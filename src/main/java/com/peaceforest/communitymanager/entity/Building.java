package com.peaceforest.communitymanager.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 所有楼号
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "building")
public class Building {
    /**
     * 楼号
     */
    @TableId(value = "building_no", type = IdType.INPUT)
    private Integer buildingNo;

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
     * 楼名
     */
    @TableField(value = "building_name")
    private String buildingName;
}