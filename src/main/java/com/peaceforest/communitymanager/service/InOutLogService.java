package com.peaceforest.communitymanager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peaceforest.communitymanager.mapper.InOutLogMapper;
import com.peaceforest.communitymanager.entity.InOutLog;
@Service
public class InOutLogService extends ServiceImpl<InOutLogMapper, InOutLog> {

}
