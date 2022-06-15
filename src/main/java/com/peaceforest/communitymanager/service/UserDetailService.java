package com.peaceforest.communitymanager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peaceforest.communitymanager.mapper.UserDetailMapper;
import com.peaceforest.communitymanager.entity.UserDetail;
@Service
public class UserDetailService extends ServiceImpl<UserDetailMapper, UserDetail> {

}
