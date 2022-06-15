package com.peaceforest.communitymanager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peaceforest.communitymanager.mapper.BuildingMapper;
import com.peaceforest.communitymanager.entity.Building;
@Service
public class BuildingService extends ServiceImpl<BuildingMapper, Building> {

}
