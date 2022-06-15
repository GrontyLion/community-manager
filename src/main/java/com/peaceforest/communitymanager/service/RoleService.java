package com.peaceforest.communitymanager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peaceforest.communitymanager.mapper.RoleMapper;
import com.peaceforest.communitymanager.entity.Role;
@Service
public class RoleService extends ServiceImpl<RoleMapper, Role> {

}
