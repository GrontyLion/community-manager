package com.peaceforest.communitymanager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peaceforest.communitymanager.entity.User;
import com.peaceforest.communitymanager.mapper.UserMapper;
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

}
