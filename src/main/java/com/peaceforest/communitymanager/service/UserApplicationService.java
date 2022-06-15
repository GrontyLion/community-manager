package com.peaceforest.communitymanager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peaceforest.communitymanager.entity.UserApplication;
import com.peaceforest.communitymanager.mapper.UserApplicationMapper;
@Service
public class UserApplicationService extends ServiceImpl<UserApplicationMapper, UserApplication> {

}
