package com.peaceforest.communitymanager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peaceforest.communitymanager.mapper.ConfigurationMapper;
import com.peaceforest.communitymanager.entity.Configuration;
@Service
public class ConfigurationService extends ServiceImpl<ConfigurationMapper, Configuration> {

}
