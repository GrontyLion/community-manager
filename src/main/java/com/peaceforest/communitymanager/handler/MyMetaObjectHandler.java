package com.peaceforest.communitymanager.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    private static final String CREATED_BY = "createdBy";
    private static final String CREATED_TIME = "createdTime";
    private static final String UPDATED_BY = "updatedBy";
    private static final String UPDATED_TIME = "updatedTime";

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        this.strictInsertFill(metaObject, CREATED_TIME, LocalDateTime::now, LocalDateTime.class);
        this.strictInsertFill(metaObject, UPDATED_TIME, LocalDateTime::now, LocalDateTime.class);
        this.strictInsertFill(metaObject, CREATED_BY, () -> "admin", String.class);
        this.strictInsertFill(metaObject, UPDATED_BY, () -> "admin", String.class);
        log.info("end insert fill ....");

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        this.strictUpdateFill(metaObject, UPDATED_TIME, LocalDateTime::now, LocalDateTime.class);
        this.strictUpdateFill(metaObject, UPDATED_BY, () -> "admin", String.class);
        log.info("end update fill ....");
    }
}
