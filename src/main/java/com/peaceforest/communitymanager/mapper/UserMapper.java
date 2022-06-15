package com.peaceforest.communitymanager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peaceforest.communitymanager.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}